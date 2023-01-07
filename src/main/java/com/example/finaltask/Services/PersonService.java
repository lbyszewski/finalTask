package com.example.finaltask.Services;

import com.example.finaltask.CRUDInterfaces.IPerson;
import com.example.finaltask.Entity.Person;
import com.example.finaltask.Repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService implements IPerson {

    private final PersonRepo personRepo;
    @Override
    public Person addPerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public Person readPerson(Person person) {
        return null;
    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }

    @Override
    public Person deletePerson(Person person) {
        return null;
    }
}
