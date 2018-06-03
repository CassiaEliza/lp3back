package com.example.aula.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.core.model.entity.Tarefas;
import com.example.aula.core.model.repository.TarefasRepository;
import com.example.aula.service.TarefasService;

@Service
public class TarefasServiceImpl implements TarefasService {
	@Autowired
	TarefasRepository tarefasRepository;
	
	@Override
	public List<Tarefas> getAll() {
		return this.tarefasRepository.findAll();
	}
	
	@Override
	public Tarefas save(Tarefas tarefas) {
		tarefas = this.tarefasRepository.save(tarefas);
		return tarefas ;
	}

}
