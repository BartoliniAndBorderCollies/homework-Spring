package com.homework.homework.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomeworkSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkSpringApplication.class, args);
	}



//	Żeby sobie powtórzyć materiał ze Springa dotychczas, stwórz sobie od nowa projekt. Dodaj thymeleaf, spring data jpa,
//	spring security oraz jeszcze jedną potrzebną, podstawową zależność (jaką?).

//	Teraz stwórz klasę dla modelu aplikacji, niech to będzie jakiś mebel - np. szafka nocna. Następnie potrzebujemy
//	widok oraz kontroler nim zarzadzajacy. Niech widok wyświetla nam tabelkę podzieloną na dwie kolumny,
//	zawierającą informacje o meblu - np. Nazwa, cena, długość, szerokość, głębokość itp.
//	W jednej kolumnie nazwa danej właściwości, w drugiej wartość.
//
//	Zapisywanie zrobimy sobie osobno, więc przejdźmy dalej.
//
//	Powiedzmy, że mamy repozytorium dla tego mebla, więc teraz chcemy zabezpieczyć nasze endpointy.
//	Chciałbym, żeby strona z tabelką o meblu miała jeszcze link, przenoszący do panelu dla pracownika,
//	na którym widzieć będziemy stan magazynowy danego produktu. Niech ta strona będzie zabezpieczona
//	(gdy w nią wchodzisz, powinieneś dostać 403 - forbidden albo prośbę o zalogowanie się), a reszta stron ma być dostępna.
//	Dodatkowo ustaw hasło i login dla zautentykowanego usera. Pamiętasz jak?
//
//	Bonusowo! Sprawdź dostęp na dane endpointy za pomocą postmana. Następnie sprawdź to samo po włączeniu dostępu dla wszystkich na każdą stronę (enpoint).
//	Czy się udało? Jakie jesteś w stanie wyciągnąć z tego wnioski?


//	Zadanie nr 2:
//
//	Jako zadanie, stwórz proszę rest controller, na którym wystawisz dwa endpointy dla obiektu klasy Cryptocurrency. Standardowo, dodaj kilka pól temu obiektowi :)
//	Jeden endpoint niech zwraca czysty obiekt, a drugi responseentity tego obiektu ze statusem ok (200).
//	Obiekt pobierz z warstwy serwisowej (czyli na serwisie go sobie tworz/trzymaj)
}
