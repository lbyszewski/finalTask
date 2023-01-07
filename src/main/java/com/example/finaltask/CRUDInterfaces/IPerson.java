package com.example.finaltask.CRUDInterfaces;


import com.example.finaltask.Entity.Person;

public interface IPerson {

    Person addPerson(Person person);
    Person readPerson(Person person);
    Person updatePerson(Person person);
    Person deletePerson(Person person);
}
