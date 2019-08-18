package com.jlp.beans;


import java.util.List;

public class Product
{
    public String productId;
    public String type;
    public String title;
    public String code;
    public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}
	public int getReviews() {
		return reviews;
	}
	public void setReviews(int reviews) {
		this.reviews = reviews;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<Object> getAdditionalServices() {
		return additionalServices;
	}
	public void setAdditionalServices(List<Object> additionalServices) {
		this.additionalServices = additionalServices;
	}
	public String getDisplaySpecialOffer() {
		return displaySpecialOffer;
	}
	public void setDisplaySpecialOffer(String displaySpecialOffer) {
		this.displaySpecialOffer = displaySpecialOffer;
	}
	public PromoMessages getPromoMessages() {
		return promoMessages;
	}
	public void setPromoMessages(PromoMessages promoMessages) {
		this.promoMessages = promoMessages;
	}
	public String getNonPromoMessage() {
		return nonPromoMessage;
	}
	public void setNonPromoMessage(String nonPromoMessage) {
		this.nonPromoMessage = nonPromoMessage;
	}
	public String getDefaultSkuId() {
		return defaultSkuId;
	}
	public void setDefaultSkuId(String defaultSkuId) {
		this.defaultSkuId = defaultSkuId;
	}
	public List<ColorSwatch> getColorSwatches() {
		return colorSwatches;
	}
	public void setColorSwatches(List<ColorSwatch> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
	public int getColorSwatchSelected() {
		return colorSwatchSelected;
	}
	public void setColorSwatchSelected(int colorSwatchSelected) {
		this.colorSwatchSelected = colorSwatchSelected;
	}
	public String getColorWheelMessage() {
		return colorWheelMessage;
	}
	public void setColorWheelMessage(String colorWheelMessage) {
		this.colorWheelMessage = colorWheelMessage;
	}
	public boolean isOutOfStock() {
		return outOfStock;
	}
	public void setOutOfStock(boolean outOfStock) {
		this.outOfStock = outOfStock;
	}
	public boolean isEmailMeWhenAvailable() {
		return emailMeWhenAvailable;
	}
	public void setEmailMeWhenAvailable(boolean emailMeWhenAvailable) {
		this.emailMeWhenAvailable = emailMeWhenAvailable;
	}
	public String getAvailabilityMessage() {
		return availabilityMessage;
	}
	public void setAvailabilityMessage(String availabilityMessage) {
		this.availabilityMessage = availabilityMessage;
	}
	public boolean isCompare() {
		return compare;
	}
	public void setCompare(boolean compare) {
		this.compare = compare;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public boolean isSwatchAvailable() {
		return swatchAvailable;
	}
	public void setSwatchAvailable(boolean swatchAvailable) {
		this.swatchAvailable = swatchAvailable;
	}
	public boolean isCategoryQuickViewEnabled() {
		return categoryQuickViewEnabled;
	}
	public void setCategoryQuickViewEnabled(boolean categoryQuickViewEnabled) {
		this.categoryQuickViewEnabled = categoryQuickViewEnabled;
	}
	public String getSwatchCategoryType() {
		return swatchCategoryType;
	}
	public void setSwatchCategoryType(String swatchCategoryType) {
		this.swatchCategoryType = swatchCategoryType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getAgeRestriction() {
		return ageRestriction;
	}
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
	public boolean isInStoreOnly() {
		return isInStoreOnly;
	}
	public void setInStoreOnly(boolean isInStoreOnly) {
		this.isInStoreOnly = isInStoreOnly;
	}
	public boolean isMadeToMeasure() {
		return isMadeToMeasure;
	}
	public void setMadeToMeasure(boolean isMadeToMeasure) {
		this.isMadeToMeasure = isMadeToMeasure;
	}
	public boolean isBundle() {
		return isBundle;
	}
	public void setBundle(boolean isBundle) {
		this.isBundle = isBundle;
	}
	public boolean isProductSet() {
		return isProductSet;
	}
	public void setProductSet(boolean isProductSet) {
		this.isProductSet = isProductSet;
	}
	public List<PromotionalFeature> getPromotionalFeatures() {
		return promotionalFeatures;
	}
	public void setPromotionalFeatures(List<PromotionalFeature> promotionalFeatures) {
		this.promotionalFeatures = promotionalFeatures;
	}
	public List<Object> getFeatures() {
		return features;
	}
	public void setFeatures(List<Object> features) {
		this.features = features;
	}
	public QuickAddToBasket getQuickAddToBasket() {
		return quickAddToBasket;
	}
	public void setQuickAddToBasket(QuickAddToBasket quickAddToBasket) {
		this.quickAddToBasket = quickAddToBasket;
	}
	public DynamicAttributes getDynamicAttributes() {
		return dynamicAttributes;
	}
	public void setDynamicAttributes(DynamicAttributes dynamicAttributes) {
		this.dynamicAttributes = dynamicAttributes;
	}
	public String getDirectorate() {
		return directorate;
	}
	public void setDirectorate(String directorate) {
		this.directorate = directorate;
	}
	public int getReleaseDateTimestamp() {
		return releaseDateTimestamp;
	}
	public void setReleaseDateTimestamp(int releaseDateTimestamp) {
		this.releaseDateTimestamp = releaseDateTimestamp;
	}
	public double averageRating;
    public int reviews;
    public Price price;
    public String image;
    public List<Object> additionalServices;
    public String displaySpecialOffer;
    public PromoMessages promoMessages;
    public String nonPromoMessage;
    public String defaultSkuId;
    public List<ColorSwatch> colorSwatches;
    public int colorSwatchSelected;
    public String colorWheelMessage;
    public boolean outOfStock;
    public boolean emailMeWhenAvailable;
    public String availabilityMessage;
    public boolean compare;
    public String fabric;
    public boolean swatchAvailable;
    public boolean categoryQuickViewEnabled;
    public String swatchCategoryType;
    public String brand;
    public int ageRestriction;
    public boolean isInStoreOnly;
    public boolean isMadeToMeasure;
    public boolean isBundle;
    public boolean isProductSet;
    public List<PromotionalFeature> promotionalFeatures;
    public List<Object> features;
    public QuickAddToBasket quickAddToBasket;
    public DynamicAttributes dynamicAttributes;
    public String directorate;
    public int releaseDateTimestamp;
}

