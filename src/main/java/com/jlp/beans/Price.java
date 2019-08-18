package com.jlp.beans;

public class Price
{
    public String getWas() {
		return was;
	}
	public void setWas(String was) {
		this.was = was;
	}
	public String getThen1() {
		return then1;
	}
	public void setThen1(String then1) {
		this.then1 = then1;
	}
	public String getThen2() {
		return then2;
	}
	public void setThen2(String then2) {
		this.then2 = then2;
	}
	public Object getNow() {
		return now;
	}
	public void setNow(Object now) {
		this.now = now;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String was;
    public String then1;
    public String then2;
    public Object now;
    public String uom;
    public String currency;
}

