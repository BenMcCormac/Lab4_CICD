package atu.ie.lab4_submission;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonController
{
    @RequestMapping("/Person")
    public String getPerson()
    {
        return "name";
    }

    @PostMapping("/createPerson")
    public String createPerson(@Valid @RequestBody Person person)
    {
        return "Name: " + person.getName() + "\n" + "Title: " + person.getTitle() + "\n" + "Employeeld: " + person.getEmployeeld() + "\n" + "Age: " + person.getAge();
    }

}
