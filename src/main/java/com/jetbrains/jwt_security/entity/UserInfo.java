package com.jetbrains.jwt_security.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "users")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (nullable = false)
    private long id;

    @Column (name = "firstname")
    private String firstname;

    @Column (name = "lastname")
    private String lastname;


    @Column (name = "email")
    private String email;


    @Column (name = "password")
    private String password;


    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(updatable = false, name = "updated_at")
    private Date updatedAt;

}
