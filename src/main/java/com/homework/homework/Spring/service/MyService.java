package com.homework.homework.Spring.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    private int number = 0;

    public int addNumber() {
        number += 1;
        return number;
    }
}
