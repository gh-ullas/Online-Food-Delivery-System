package com.ullas.foodiesapi.service;

import com.ullas.foodiesapi.io.CartRequest;
import com.ullas.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}

