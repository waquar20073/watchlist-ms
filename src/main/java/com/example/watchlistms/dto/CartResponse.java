package com.example.watchlistms.dto;

public class CartResponse {

    private String message;
    private ProductResponse movie;

    public CartResponse(String message, ProductResponse movie) {
        this.message = message;
        this.movie = movie;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ProductResponse getMovie() {
        return movie;
    }

    public void setMovie(ProductResponse movie) {
        this.movie = movie;
    }
}
