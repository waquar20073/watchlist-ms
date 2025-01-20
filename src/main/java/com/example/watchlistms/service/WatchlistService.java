package com.example.watchlistms.service;

import com.example.watchlistms.WatchlistRepository.Watchlist;
import com.example.watchlistms.WatchlistRepository.WatchlistRepository;
import com.example.watchlistms.dto.MovieResponse;
import com.example.watchlistms.dto.WatchlistResponse;
import com.example.watchlistms.entity.Watchlist;
import feign.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


@Service
public class WatchlistService {

    @Autowired
    private WatchlistRepository watchlistRepository;
    String MOVIE_API_URL = "http://34.148.175.45:8080/api-gateway/movie-service/movie/<movie-id>";
    public WatchlistResponse addToWatchlist(String userId, String movieId) {

        String url = MOVIE_API_URL +movieId;

        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<MovieResponse.Movie> movieResponse = restTemplate.getForEntity(url,MovieResponse.Movie.class);
            MovieResponse.Movie movie = movieResponse.getBody();

            // save
            com.example.watchlistms.entity.Watchlist watchlist = new com.example.watchlistms.entity.Watchlist();
            watchlist.setUserId(userId);
            watchlist.setMovieId(movieId);
            watchlistRepository.save(watchlist);

            MovieResponse response = new MovieResponse();
            response.setMessage("Movie added to watchlist successsfully ");
            response.setMovie(movieId);

            return response;

        }catch (HttpClientErrorException.NotFound e){

            MovieResponse response = new MovieResponse();
            response.setMessage("Movie not found");

            return new response();

        }
    }
}
