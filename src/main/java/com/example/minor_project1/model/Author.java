package com.example.minor_project1.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column (unique=true, nullable= false)
    private String email;


    private String country;

    @CreationTimestamp
    private Date created_At;
    @UpdateTimestamp
    private Date updated_At;

    @JoinColumn
    @ManyToOne
    private Student student;

}
