package com.example.finaltask.Controller;

import com.example.finaltask.CRUDInterfaces.IPerson;
import com.example.finaltask.Entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/person")
public class PersonController {

    private final IPerson personSaver;
    @PostMapping(value = "/save")
    public Person savePersonEntityToDatabase(@RequestBody Person person){
        return personSaver.addPerson(person);
    }
}
