package atu.ie.lab4_submission;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person
{
    @NotBlank(message = "Name can't be blank")
    private String name;

    @NotBlank(message = "Title can't be blank")
    private String title;

    @NotBlank(message = "Employeeld can't be blank")
    private String employeeld;

    @PositiveOrZero(message = "Age must be positive")
    @NotNull(message = "Age can't be blank")
    private int age;
}
