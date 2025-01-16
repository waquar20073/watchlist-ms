package com.example.watchlistms.controller;

import com.example.watchlistms.dto.WatchlistRequest;
import com.example.watchlistms.service.WatchlistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie-service")
public class WatchlistController {

    private final WatchlistService watchlistService;

    public WatchlistController(WatchlistService watchlistService) {
        this.watchlistService = watchlistService;
    }

    @PostMapping("/watchlist")
    public ResponseEntity<Object> addToWatchlist(@RequestBody WatchlistRequest request) {
        return ResponseEntity.ok(watchlistService.addToWatchlist(request.getUserId(), request.getMovieId()));
    }
}
