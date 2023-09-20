package com.homework.homework.Spring.model;

//Stwórz klasę Task z polami id, tytuł, opis oraz czy zostało zakończone.
//        Jeśli potrafisz, przygotuj warstwę repozytorium i użyj np. H2 albo mysql. Jeśli nie, zamockuj repozytorium
//        w taki sposób, aby całość zapisywała się w programie w kolekcji.
//        Następnie wystaw endpointy restowe, które pozwolą na odczytanie istniejących tasków, dodanie nowego taska,
//        oznaczenie taska jako wykonane i usunięcie taska.
//        Odpowiedzi API powinny być w formacie JSON.

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Title cannot be null")
    private String title;
//    @NotNull(message = "Description cannot be null") - tylko null
    // @NotEmpty - pusty String i null (ale spacje przejdą)
    //@NotBlank - bez spacji, pusty String, null - wszystko to zblokowane
    //@Email - waliduje adres email,ale trzeba w nawiasie dodać regex @Email ()
    @NotNull
    @Size(min = 3, max = 5)
    private String description;

    @Digits(integer = 3, fraction = 0)
    private Integer number;
    @PastOrPresent
    private LocalDateTime dateTime;
    //"2023-12-03T11:20:00" -> format w JSON
    private boolean isCompleted;

    public Task() {
    }

    public Task(Long id, String title, String description, Integer number, LocalDateTime dateTime, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.number = number;
        this.dateTime = dateTime;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
