package com.example.watchlistms.dto;

public class MovieResponse {

    private String message;
    private String movie;

    public String getMessage() {
        return message;
    }

    public String getMovie() {
        return movie;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public static class Movie{
        private String id;
        private String name;
        private  String year;
        private String genre;
        private String overview;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getYear() {
            return year;
        }

        public String getGenre() {
            return genre;
        }

        public String getOverview() {
            return overview;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }
    }

}

