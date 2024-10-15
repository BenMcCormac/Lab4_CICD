package atu.ie.lab4_submission;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController
{
    @PostMapping("/createPerson")
    public String createPerson()
    {


        return "";
    }
}
