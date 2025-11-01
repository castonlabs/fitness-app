package com.workoutapp.userservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
@Data
@Builder

public class UserResponse {
    private String userName;

    private String lastName;


    private String email;

    private String phone;


    private LocalDate createdAt;

    private LocalDate updatedAt;
}
