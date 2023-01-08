package com.example.finaltask.Controller;

import com.example.finaltask.CRUDInterfaces.IPerson;
import com.example.finaltask.Entity.Person;
import com.example.finaltask.Repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/person")
public class PersonController {

    private final IPerson personConstruct;

    private final PersonRepo personRepo;


    @GetMapping(value = "/{personId}")
    public Person findByIdPerson(@PathVariable("personId") Long personId){
        Person findById = personConstruct.readPerson(personId);
        return findById ;
    }



    @PostMapping(value = "/save")
    public Person savePersonEntityToDatabase(@RequestBody Person person){
        return personConstruct.addPerson(person);
    }


    @PutMapping(value = "/persons/{personId}")

    public void updateEntityPerson(@RequestBody Person person, @PathVariable ("personId")Long personId){
        personConstruct.updatePerson(person,personId);

    }
    @DeleteMapping(value = "/deleteEntityRow/{personId}")
    public List<Person> deleteEntityRow(@PathVariable("personId") Long personId){
        personConstruct.deletePerson(personId);
        return personRepo.findAll();
    }
}
