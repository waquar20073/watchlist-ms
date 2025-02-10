package com.example.cartms.service;

import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.cartms.dto.ProductDetails;

@Service
public class CartService {
    public ProductDetails getProductDetails(String productId) {
        return null;
    }
}