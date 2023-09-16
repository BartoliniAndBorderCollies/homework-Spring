package com.homework.homework.Spring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Cryptocurrency {

    //model nie ma @Component bo ja tym zarządzam (ja tworzę obiekt w serwisie)
    // model musi miec gettery i settery zeby bean sie zrobił

    private String name;
    private Double value;

    public Cryptocurrency(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
