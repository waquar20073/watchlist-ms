package com.example.watchlistms.dto;

public class CartResponse {

    private String message;
    private int cost;

    public CartResponse(String message, int cost) {
        this.message = message;
        this.cost = cost;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
