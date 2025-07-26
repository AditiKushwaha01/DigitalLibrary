package com.example.minor_project1.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Book {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;

        @Enumerated(value= EnumType.STRING)
        private Genre genre;

        private Boolean isAvailable;
        private Long issueCount;

        @CreationTimestamp
        private Date created_At;
        @UpdateTimestamp
        private Date updated_At;

        @JoinColumn
        @ManyToOne
        private Student student;

    @JoinColumn
    @ManyToOne
    private Author author;





}
