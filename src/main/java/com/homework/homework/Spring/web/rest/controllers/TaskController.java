package com.homework.homework.Spring.web.rest.controllers;

import com.homework.homework.Spring.model.Task;
import com.homework.homework.Spring.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TaskController {

    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Optional<Task> getTaskById(@PathVariable("id") Long id) {
        return taskRepository.findTaskById(id);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTaskToBeCompleted (@PathVariable("id") Long id) {
        Optional<Task> optionalTask = taskRepository.findTaskById(id);
        Task task = optionalTask.orElseThrow(() -> new IllegalArgumentException("nie ma takiego taska" + id));

        task.setCompleted(true);
        return taskRepository.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask (@PathVariable("id") Long id) {
        Optional<Task> optionalTask = taskRepository.findTaskById(id);
        Task task = optionalTask.orElseThrow(() -> new IllegalArgumentException("nie ma takiego taska" + id));

        taskRepository.delete(task);
    }

//    lub:
//
//    @DeleteMapping("/tasks/{id}")
//    public void deleteTask (@PathVariable("id") Long id) {
//        taskRepository.deleteById(id);
//    }


    // z czym miałem problem?
    //1. spring security i autoryzacja w postmanie
    //2. chciałem zrobić update taki, żeby cały request body był i że mogę zmienić w postmanie cokolwiek a propos danego taska
    // nie potrafiłem i zrobiłem tylko zmianę na setCompleted-> true;

}
