package com.homework.homework.Spring.web.rest.controllers;

import com.homework.homework.Spring.model.Task;
import com.homework.homework.Spring.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TaskRestController {

    private final TaskService taskService;

    public TaskRestController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @GetMapping("/tasks")
    public Iterable<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Optional<Task> getTaskById(@PathVariable("id") Long id) {
        return taskService.getTaskById(id);
    }

    @PutMapping("/tasks/{id}") // problem wynika przez post i put na tej samej ścieżce, więc pewnie będziemy
    // zmieniać ściezkę, żeby się nie pokrywała z postem. great! i jednak wracamy do pathVariable bo nadpisuje puste
    // wartości nullem i jest utrata danych tych co byly, np. description. jesli update description bedzie pusty to
    // nadpisze i nowy obiekt bedzie pusty w tym miejscu
    public Task updateTaskToBeCompleted(@PathVariable Long id, @Valid @RequestBody Task t) {
        return taskService.updateTaskToBeCompleted(id, t);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask (@PathVariable("id") Long id) {
        taskService.deleteTask(id);
    }

//    lub:
//
//    @DeleteMapping("/tasks/{id}")
//    public void deleteTask (@PathVariable("id") Long id) {
//        taskRepository.deleteById(id);
//    }


    // z czym miałem problem?
    //1. spring security i autoryzacja w postmanie - jak rozwiazałem problem:
//    - zmiana z form auth na basic auth -> ale nadal problem z metodami http, tylko get przepuszczał
    // trzeba było dodać .csrf(AbstractHttpConfigurer::disable) i zaczęło działac OK.


    //2. chciałem zrobić update taki, żeby cały request body był i że mogę zmienić w postmanie cokolwiek a propos danego taska
    // nie potrafiłem i zrobiłem tylko zmianę na setCompleted-> true;


}
