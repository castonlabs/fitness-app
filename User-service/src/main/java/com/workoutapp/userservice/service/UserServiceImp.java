package com.workoutapp.userservice.service;

import com.workoutapp.userservice.dto.UserRequest;
import com.workoutapp.userservice.dto.UserResponse;
import com.workoutapp.userservice.entity.User;
import com.workoutapp.userservice.exception.UserAlreadyExistException;
import com.workoutapp.userservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserServiceInterf {
    private final UserRepository userRepository;

    @Override
    public UserResponse registerUser(UserRequest request){
     if( userRepository.findUserByEmail(request.getEmail()).isPresent() ){
         throw new UserAlreadyExistException("the user already exists");

     }
     User registerdUser  = converToEntity(request);
     userRepository.save(registerdUser);
     return convertToResponse(registerdUser);


    }

    public User converToEntity(UserRequest request){
        return User.builder()
                .userName(request.getUserName())
                .lastName(request.getLastName())
                .password(request.getPassword())
                .build();
    }

    public UserResponse convertToResponse(User response){
        return UserResponse.builder()
                .userName(response.getUserName())
                .lastName(response.getLastName())
                .createdAt(response.getCreatedAt())
                .updatedAt(response.getUpdatedAt())
                .build();
    }

}
