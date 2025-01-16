package com.example.watchlistms.dto;

public class MovieResponse {
    private String movie_name;
    private String year;
    private String genre;
    private String overview;

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String name) {
        this.movie_name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}

