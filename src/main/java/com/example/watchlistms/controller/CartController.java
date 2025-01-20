package com.example.watchlistms.controller;

import com.example.watchlistms.dto.CartRequest;
import com.example.watchlistms.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart-service")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/cart")
    public ResponseEntity<Object> addToWatchlist(@RequestBody CartRequest request) {
        return ResponseEntity.ok(cartService.addToCart(request.getUserId(), request.getProductId()));
    }
}
