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

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task updateTaskToBeCompleted (Long id, Task taskToUpdate) {
        Task task = getTask(id);

//        if(taskToUpdate.getTitle() == null || taskToUpdate.getDescription() == null) {
//            throw new IllegalArgumentException("Title and Description must have values");
//        }

        task.setTitle(taskToUpdate.getTitle());
        task.setDescription(taskToUpdate.getDescription());
        task.setCompleted(taskToUpdate.isCompleted());
        return taskRepository.save(task);
    }

    public void deleteTask (Long id) {
        Task task = getTask(id);
        taskRepository.delete(task);
    }

    private Task getTask(Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if(optionalTask.isEmpty()) {
            throw new IllegalArgumentException("nie ma takiego taska" + id);
        }
//        return optionalTask.get();
        return optionalTask.orElseThrow(() -> new IllegalArgumentException("nie ma takiego taska" + id));
    }
}
