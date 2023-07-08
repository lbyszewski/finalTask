package com.example.finaltask.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "BankAccount")
public class BankAccount  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBankAccount;

    @Column(name = "accountOwners")
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Person> accountOwners;

    @Column(name = "balance")
    private double blance;




}
