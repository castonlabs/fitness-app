package com.workoutapp.userservice.controller;

import com.workoutapp.userservice.dto.UserRequest;
import com.workoutapp.userservice.dto.UserResponse;
import com.workoutapp.userservice.service.UserServiceImp;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/billing")
@RequiredArgsConstructor
public class AuthController {
    private  final UserServiceImp userServiceImp;
    @PostMapping("/")
    public ResponseEntity<UserResponse> register( @Valid UserRequest userRequest ){
        UserResponse registeredUser = userServiceImp.registerUser( userRequest );
        return ResponseEntity.ok().body( registeredUser );
    }
}
