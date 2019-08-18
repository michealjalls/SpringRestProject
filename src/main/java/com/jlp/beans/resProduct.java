package com.jlp.beans;

import java.util.List;

public class resProduct {

	public resProduct(String productId, String title, String nowPrice, String priceLabel,
			List<resColorSwatches> colorSwatches) {
		super();
		this.productId = productId;
		this.nowPrice = nowPrice;
		this.title = title;
		this.priceLabel = priceLabel;
		this.colorSwatches = colorSwatches;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getNowPrice() {
		return nowPrice;
	}

	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPriceLabel() {
		return priceLabel;
	}

	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}

	public String productId;
	public String nowPrice;
	public String title;
	public String priceLabel;
	public List<resColorSwatches> colorSwatches;

	public List<resColorSwatches> getColorSwatches() {
		return colorSwatches;
	}

	public void setColorSwatches(List<resColorSwatches> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
}
