package com.example.finaltask.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.Set;

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

    @Column(name = "adress")
    @Embedded
    private Adress adress;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "Password")
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    @Column(name = "bankAccounts")
    private Set<BankAccount> bankAccounts;

}
