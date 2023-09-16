package com.homework.homework.Spring.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//ta metoda run uruchamia się zaraz po uruchomieniu aplikacji i springa -> daje to mi mozliwosc dodania tutaj logiki programu co ma sie dziac
@Component
@Slf4j //to jest dzieki Lombokowi, daje to mozliwosc zastosowania log jak ponizej
// Simple Logging Facade for Java
public class MyLogger implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("siema, odpalam się właśnie!");
    }

    public void cokolwiek() {
        System.out.println("ja się nie wyświetlę");
    }
}
