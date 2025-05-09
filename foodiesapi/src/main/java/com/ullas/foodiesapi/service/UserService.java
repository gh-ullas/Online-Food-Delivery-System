package com.ullas.foodiesapi.service;

import com.ullas.foodiesapi.io.UserRequest;
import com.ullas.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}

