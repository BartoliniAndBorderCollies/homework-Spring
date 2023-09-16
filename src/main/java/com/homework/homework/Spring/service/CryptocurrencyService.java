package com.homework.homework.Spring.service;

import com.homework.homework.Spring.model.Cryptocurrency;
import org.springframework.stereotype.Service;


//jak walę postmana to leci null, że cryptoservice jest nullem, mimo ze tworzę go tu i przekazuję do controllera
// powodem jest to, że ... że w controlerze nie dodałem constructora!!! (czyli zabrakło dependency injection CryptocurrencySerwisu)
@Service
public class CryptocurrencyService {

    private Cryptocurrency cryptocurrency = new Cryptocurrency("test waluty", 88.8);

    public Cryptocurrency getCryptocurrency() {
        return cryptocurrency;
    }
}
