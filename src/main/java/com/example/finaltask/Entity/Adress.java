package com.example.finaltask.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.core.SpringVersion;
@Data
@Embeddable
public class Adress {

    @Column(name = "streetName")
    private String streetName;

    @Column(name="numberOfBilding")
    private int numberOfBilding;

    @Column(name="numberOfHouse")
    private int numberOfHouse;

    @Column(name = "myCity")
    private String myCity;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "stateInCountry")
    private String stateInCountry;
}
