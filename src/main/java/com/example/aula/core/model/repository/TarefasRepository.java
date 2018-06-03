package com.example.aula.core.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula.core.model.entity.Tarefas;
public interface TarefasRepository extends JpaRepository <Tarefas , Long> {

}
