package com.devwill.gerenciadortarefas.service;

import com.devwill.gerenciadortarefas.dto.TaskDTO;
import com.devwill.gerenciadortarefas.model.Task;
import com.devwill.gerenciadortarefas.repository.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task saveTask(Task task) {
        return repository.save(task);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
    public Task updateTask(Long id, TaskDTO dto) {
        Task existingTask = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tarefa com ID " + id + " não encontrada."));

        existingTask.setTitle(dto.getTitle());
        existingTask.setDescription(dto.getDescription());
        existingTask.setStatus(dto.getStatus());
        existingTask.setDueDate(dto.getDueDate());

        return repository.save(existingTask);
    }


}

