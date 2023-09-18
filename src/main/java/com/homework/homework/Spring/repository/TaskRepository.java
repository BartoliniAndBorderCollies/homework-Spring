package com.homework.homework.Spring.repository;

import com.homework.homework.Spring.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
