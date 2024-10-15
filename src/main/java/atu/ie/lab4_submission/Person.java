package atu.ie.lab4_submission;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Person
{
    @NotBlank(message = "Name can't be blank")
    private String name;

    @NotBlank(message = "Title can't be blank")
    private String title;

    @NotBlank(message = "Title can't be blank")
    private String employeeld;
    @NotNull(message = "Age can't be blank")
    @PositiveOrZero(message = "Age can not be negative")
    private int age;

    @NotBlank(message = "Email can't be blank")
    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Position can't be blank")
    private String position;

    @NotBlank(message = "Department can't be blank")
    private String department;
}
