package com.homework.homework.Spring.web.rest.controllers;


import com.homework.homework.Spring.model.Cryptocurrency;
import com.homework.homework.Spring.service.CryptocurrencyService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Jako zadanie, stwórz proszę rest controller, na którym wystawisz dwa endpointy dla obiektu klasy Cryptocurrency.
// Standardowo, dodaj kilka pól temu obiektowi :)
//        Jeden endpoint niech zwraca czysty obiekt, a drugi responseentity tego obiektu ze statusem ok (200).
//        Obiekt pobierz z warstwy serwisowej (czyli na serwisie go sobie tworz/trzymaj)

@RestController
@RequestMapping("/api")
public class HomeworkRestController {

    private CryptocurrencyService cryptocurrencyService;

    public HomeworkRestController(CryptocurrencyService cryptocurrencyService) {
        this.cryptocurrencyService = cryptocurrencyService;
    }

    @GetMapping("/currency")
    public Cryptocurrency getCurrency() {
        return cryptocurrencyService.getCryptocurrency();
    }

    @GetMapping("/response")
    public ResponseEntity<Cryptocurrency> getResponseEntity() {
        return new ResponseEntity<>(cryptocurrencyService.getCryptocurrency(), HttpStatusCode.valueOf(200));
    }
}
