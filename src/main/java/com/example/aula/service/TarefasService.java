package com.example.aula.service;

import com.example.aula.core.model.entity.Tarefas;
import java.util.List;

public interface TarefasService {
	public List<Tarefas> getAll();
	public Tarefas save (Tarefas tarefas);
}
