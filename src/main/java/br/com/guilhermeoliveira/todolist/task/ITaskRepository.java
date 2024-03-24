package br.com.guilhermeoliveira.todolist.task;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<TaskModal, UUID> {
    List<TaskModal> findByIdUser(UUID idUser);

}
