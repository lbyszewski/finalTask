package com.example.finaltask;

import com.example.finaltask.CRUDInterfaces.IPerson;
import com.example.finaltask.Entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(name = "/person")
public class PersonController {

    private IPerson personSaver;
    @PostMapping("/save")
    public Person savePersonEntityToDatabase(@RequestBody Person person){
        return personSaver.addPerson(person);
    }
}
