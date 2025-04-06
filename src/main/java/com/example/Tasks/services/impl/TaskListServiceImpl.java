package com.example.Tasks.services.impl;

import com.example.Tasks.domain.entities.TaskList;
import com.example.Tasks.repository.TaskListRepository;
import com.example.Tasks.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }

}
