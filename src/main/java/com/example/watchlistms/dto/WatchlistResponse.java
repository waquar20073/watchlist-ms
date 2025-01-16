package com.example.watchlistms.dto;

public class WatchlistResponse {

    private String message;
    private MovieResponse movie;

    public WatchlistResponse(String message, MovieResponse movie) {
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

    public MovieResponse getMovie() {
        return movie;
    }

    public void setMovie(MovieResponse movie) {
        this.movie = movie;
    }
}
