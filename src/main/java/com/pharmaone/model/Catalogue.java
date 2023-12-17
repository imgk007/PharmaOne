package com.pharmaone.model;

public class Catalogue {
    int productId;
    String productName;
    int quantity;
    String productType;
    String expiryDate;

    public Catalogue(){}
    public Catalogue(int productId, String productName, int quantity, String productType, String expiryDate) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.productType = productType;
        this.expiryDate = expiryDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
