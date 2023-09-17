package com.homework.homework.Spring.repository;

import com.homework.homework.Spring.model.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findAll();
    Optional<Task> findTaskById(Long id);
}
