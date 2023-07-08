package com.example.finaltask.Services;

import com.example.finaltask.CRUDInterfaces.IPerson;
import com.example.finaltask.Entity.Person;
import com.example.finaltask.Repository.PersonRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class PersonService implements IPerson {

    private final PersonRepo personRepo;
    private PasswordEncoder passwordEncoder;



    @Override
    public Person addPerson(Person person) {
        passwordEncoder = new BCryptPasswordEncoder();
        String encode = this.passwordEncoder.encode(person.getPassword());
        person.setPassword(encode);
        return personRepo.save(person);
    }

    @Override
    public Person readPerson(Long personId) {
        Person personFind = personRepo.findById(personId).orElse(null);
        return personFind;
    }

    @Override
    @Transactional
    public void updatePerson(Person person, Long id) {



            Person personUdpater = personRepo.findById(person.getIdPerson()).orElseThrow();
                personUdpater.setFirstName(person.getFirstName());
                personUdpater.setLastName(person.getLastName());
                personUdpater.setEmailAddress(person.getEmailAddress());
                personRepo.save(personUdpater);


    }

    @Override
    public void deletePerson(Long id) {
       personRepo.deleteById(id);
    }


}
