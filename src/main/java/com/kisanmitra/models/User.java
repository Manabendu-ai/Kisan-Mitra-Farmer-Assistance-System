package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(length = 10)
    private String role;

    @Column(length = 20)
    private String name;

    @Column(length = 15)
    private String phno;

    @Column(length = 20)
    private String email;

    private Boolean verifiedStatus;

    private LocalDateTime createdAt;
}
