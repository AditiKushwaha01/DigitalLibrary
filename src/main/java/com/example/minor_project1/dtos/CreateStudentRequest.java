package com.example.minor_project1.dtos;


import com.example.minor_project1.model.Department;
import com.example.minor_project1.model.Student;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CreateStudentRequest {

    @NotBlank
    private String name;

    @NotNull
    private Department department;

    @NotBlank
    @Email
    private String email;
    private String country;

    @NotBlank
    private String rollNumber;



    public Student convertToStudent(){

        return Student.builder()
                .name(this.name)
                .department(this.department)
                .email(this.email)
                .rollNumber(this.rollNumber)
                .country(this.country)
                .build();
    }

}
