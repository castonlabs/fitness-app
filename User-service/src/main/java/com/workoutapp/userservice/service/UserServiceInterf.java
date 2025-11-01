package com.workoutapp.userservice.service;

import com.workoutapp.userservice.dto.UserRequest;
import com.workoutapp.userservice.dto.UserResponse;

public interface UserServiceInterf {
    UserResponse registerUser(UserRequest request);
}
