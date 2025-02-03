package com.example.watchlistms.controller;

import com.example.watchlistms.dto.WatchlistRequest;
import com.example.watchlistms.service.WatchlistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/watchlist-service")
public class WatchlistController {

    private final WatchlistService watchlistService;

    public WatchlistController(WatchlistService watchlistService) {
        this.watchlistService = watchlistService;
    }

    @GetMapping("/watchlist")
    public ResponseEntity<Object> addToWatchlist(@RequestParam String userId) {
        return ResponseEntity.ok(watchlistService.addToCart(userId));
    }
}
