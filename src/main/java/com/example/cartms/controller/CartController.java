package com.example.cartms.controller;

import com.example.cartms.dto.CartResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.cartms.service.CartService;
import com.example.cartms.dto.ErrorResponseDto;
import com.example.cartms.entity.Cart;
import com.example.cartms.dto.ProductDetails;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cart-service")
public class CartController {

    @GetMapping("/cart")
    public ResponseEntity<?> getCart(@RequestParam String userId) {

        
        return ResponseEntity.ok(new CartResponse(null, null , 0));
    }
}