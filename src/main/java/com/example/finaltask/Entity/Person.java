package com.example.finaltask.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
@Table(name = "Person")
public class Person {


    @GeneratedValue(strategy = GenerationType.AUTO )
    @Id
    @Column(name = "id")
    private Long idPerson;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "city")
    private String city;

    @Column(name = "emailAddress")
    private String emailAddress;

}
