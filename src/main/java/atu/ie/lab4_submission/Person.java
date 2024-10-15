package atu.ie.lab4_bmcc;

import jakarta.validation.constraints.NotNull;

public class Person
{
    @NotNull
    private String name;
    private String title;
    private String employeeld;
    private int age;
    private String email;
    private String position;
    private String department;
}
