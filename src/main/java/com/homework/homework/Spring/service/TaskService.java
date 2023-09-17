package com.homework.homework.Spring.service;

import com.homework.homework.Spring.model.Task;
import com.homework.homework.Spring.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findTaskById(id);
    }

    public Task updateTaskToBeCompleted (Long id) {
        Optional<Task> optionalTask = taskRepository.findTaskById(id);
        if(optionalTask.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        Task task = optionalTask.orElseThrow(() -> new IllegalArgumentException("nie ma takiego taska" + id));

        task.setCompleted(true);
        return taskRepository.save(task);
    }

    public void deleteTask (Long id) {
        Optional<Task> optionalTask = taskRepository.findTaskById(id);
        if(optionalTask.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        Task task = optionalTask.orElseThrow(() -> new IllegalArgumentException("nie ma takiego taska" + id));

        taskRepository.delete(task);
    }



}
