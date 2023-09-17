package com.homework.homework.Spring.model;

//Stwórz klasę Task z polami id, tytuł, opis oraz czy zostało zakończone.
//        Jeśli potrafisz, przygotuj warstwę repozytorium i użyj np. H2 albo mysql. Jeśli nie, zamockuj repozytorium
//        w taki sposób, aby całość zapisywała się w programie w kolekcji.
//        Następnie wystaw endpointy restowe, które pozwolą na odczytanie istniejących tasków, dodanie nowego taska,
//        oznaczenie taska jako wykonane i usunięcie taska.
//        Odpowiedzi API powinny być w formacie JSON.

import jakarta.persistence.*;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String description;
    private boolean isCompleted;

    public Task() {
    }

    public Task(Long id, String title, String description, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
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

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
