package com.workoutapp.userservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder
@Getter
@Setter

public class User {
    @Id
    private  long id;
    private String userName;

    private String lastName;
@NotBlank(message="the password can not be blank")

@Size(min=7,message ="whe password must have at least7 characters")
    private String password;

    @NotBlank(message = "email must no tbe blank")
    private String email;

    private String phone;

    @CreationTimestamp
    private LocalDate createdAt;

    @UpdateTimestamp
    private LocalDate updatedAt;

    @Enumerated(EnumType.STRING)
    private UserType userType;


}
