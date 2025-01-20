package com.example.watchlistms.dto;

import jakarta.validation.constraints.NotNull;

public class WatchlistRequest {

    @NotNull(message = "userId cannot be null")
    private String userId;

    @NotNull(message = "movieId cannot be null")
    private String movieId;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
