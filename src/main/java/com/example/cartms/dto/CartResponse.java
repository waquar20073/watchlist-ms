package com.example.cartms.dto;

public class CartResponse {
    public String userId;
    public String productId;
    public double price;

    public CartResponse(String userId, String productId, double price) {
        this.userId = userId;
        this.productId = productId;
        this.price = price;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
}