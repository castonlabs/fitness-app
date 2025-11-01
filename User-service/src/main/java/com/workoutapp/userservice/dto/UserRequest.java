package com.workoutapp.userservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class UserRequest {
    private String userName;

    private String lastName;
    @NotBlank(message="the password can not be blank")

    @Size(min=7,message ="whe password must have at least7 characters")
    private String password;

    @NotBlank(message = "email must no tbe blank")
    private String email;




}
