package com.jlp.beans;

import java.awt.Color;

import javax.swing.text.html.StyleSheet;

import org.hibernate.validator.internal.util.privilegedactions.NewJaxbContext;
import org.springframework.beans.factory.annotation.Autowired;

public class resColorSwatches {
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBasicColor() {
		return basicColor;
	}

	public void setBasicColor(String basicColor) {
		this.basicColor = basicColor;
	}

	public String getSkuId() {
		return skuId;
	}

	@Autowired
	public resColorSwatches(String color, String basicColor, String skuId) {
		super();
		this.color = color;
		int r = 0, g = 0, b = 0;
		String hex;
		try {
			StyleSheet s = new StyleSheet();
			Color clr = s.stringToColor(basicColor);
			hex = "#" + Integer.toHexString(clr.getRGB()).substring(2);
		} catch (NullPointerException e) {
			hex = basicColor;
		}
		this.basicColor = hex;
		this.skuId = skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String color;
	public String basicColor;
	public String skuId;
}
