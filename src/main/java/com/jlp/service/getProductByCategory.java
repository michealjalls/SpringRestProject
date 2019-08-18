package com.jlp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.jlp.beans.ColorSwatch;
import com.jlp.beans.Price;
import com.jlp.beans.Product;
import com.jlp.beans.Products;
import com.jlp.beans.resColorSwatches;
import com.jlp.beans.resProduct;

@RestController
public class getProductByCategory {

	@Value("${producturl}")
	private String producturl;

	@RequestMapping("/getProductByCategory")
	public @ResponseBody List getProductByCategory(@RequestParam("labelType") String labelType) {
		System.out.println("labelType" + labelType);
		RestTemplate restTemplate = new RestTemplate();
		// RestClient restClient = new RestCli
		String str = restTemplate.getForObject(producturl, String.class);
		Gson gson = new Gson();
		Products prdLst = gson.fromJson(str, Products.class);
		List<Product> list = prdLst.getProducts();
		Function<String, String> priceconverter = (i) -> {
			if (i.contains(".")) {
				String substr = i.substring(0, i.indexOf("."));
				Integer result = Integer.valueOf(substr);
				if (result < 10) {
					return i;
				}
				return result.toString();
			}
			return i;
		};
		Function<String, String> symbolconverter = (i) -> {
			if (i.equalsIgnoreCase("GBP"))
				return "\u00a3";
			return "pound";
		};
		BiFunction<String, String, String> combinePrice = (nowPrice, currencyCode) -> {
			String strmsg = "";
			strmsg = (symbolconverter.apply(currencyCode));
			if (nowPrice.contains("=")) {
				strmsg = strmsg + nowPrice;
			} else {
				strmsg = strmsg + (priceconverter.apply(nowPrice));
			}
			return strmsg;
		};
		BiFunction<String, String, String> combinePriceLabel = (priceTime, priceString) -> {
			String strmsg = "";
			strmsg = priceTime.concat(priceString);
			return strmsg;
		};
		BiFunction<String, Price, String> preparePriceLabel = (labTyp, priceInstance) -> {
			String strmsg = "";
			if (StringUtils.isEmpty(strmsg)) {
				labTyp = "ShowWasNow";
			}
			if (labTyp.equalsIgnoreCase("ShowWasNow")) {
				if (!StringUtils.isEmpty(priceInstance.getWas())) {
					strmsg = combinePriceLabel.apply("WAS ",
							combinePrice.apply(priceInstance.getWas(), priceInstance.getCurrency()));
				}
				if (!StringUtils.isEmpty(strmsg)) {
					strmsg = strmsg + combinePriceLabel.apply(" NOW ",
							combinePrice.apply(priceInstance.getNow().toString(), priceInstance.getCurrency()));
				}
			} else if (labTyp.equalsIgnoreCase("ShowWasThenNow")) {
				if (!StringUtils.isEmpty(priceInstance.getWas())) {
					strmsg = combinePriceLabel.apply("WAS ",
							combinePrice.apply(priceInstance.getWas(), priceInstance.getCurrency()));
				}
				if (!StringUtils.isEmpty(strmsg)) {
					strmsg = strmsg + combinePriceLabel.apply(" THEN ",
							combinePrice.apply(priceInstance.getThen1(), priceInstance.getCurrency()));
				}
				if (!StringUtils.isEmpty(strmsg)) {
					strmsg = strmsg + combinePriceLabel.apply(" NOW ",
							combinePrice.apply(priceInstance.getNow().toString(), priceInstance.getCurrency()));
				}
			}
			return strmsg;
		};
		Function<List<ColorSwatch>, List<resColorSwatches>> prepareColorSwatches = (colorSwatchlist) -> {
			List<resColorSwatches> resColorSwatchesLst = new ArrayList<resColorSwatches>();
			colorSwatchlist.stream().forEach((colorSwatch) -> {
				resColorSwatchesLst.add(new resColorSwatches(colorSwatch.getColor(), colorSwatch.getBasicColor(),
						colorSwatch.getSkuId()));
			});
			return resColorSwatchesLst;
		};
		List<resProduct> resprodLst = new ArrayList<resProduct>();
		list.stream().forEach((i) -> {
			resprodLst.add(new resProduct(i.getProductId(), i.getTitle(),
					combinePrice.apply(i.getPrice().getNow().toString(), i.getPrice().currency),
					preparePriceLabel.apply(labelType, i.getPrice()),
					prepareColorSwatches.apply(i.getColorSwatches())));
		});
		return resprodLst;
	}
}
