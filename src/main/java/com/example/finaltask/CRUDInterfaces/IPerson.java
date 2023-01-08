package com.example.finaltask.CRUDInterfaces;


import com.example.finaltask.Entity.Person;

public interface IPerson {

    Person addPerson(Person person);
    Person readPerson(Long id);
    void updatePerson(Person person,Long id);
    void deletePerson(Long id);
}
