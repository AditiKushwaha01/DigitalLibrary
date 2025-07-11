package com.example.minor_project1.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique= true, nullable =false)
    private String rollNumber;

    @Column (unique =true, nullable= false)
    private String email;

    private String country;

   @CreationTimestamp
    private Date created_At;
   @UpdateTimestamp
    private Date updated_At;

@Enumerated(value =EnumType.STRING)
    private Department department;

@OneToMany(mappedBy ="my_student") // this is adding a back reference
private List<Book> bookList;

}
