package com.example.aula.controller.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula.controller.TarefasController;
import com.example.aula.core.model.entity.Tarefas;
import com.example.aula.service.TarefasService;

import reactor.core.publisher.Mono;
@RestController
public class TarefasControllerImpl implements TarefasController {
	@Autowired 
	TarefasService tarefasService;
	@Override
	public Mono<List<Tarefas>> getTarefas(){
		List<Tarefas> listaTarefas = this.tarefasService.getAll();
		return Mono.just(listaTarefas);
	}
	@Override
	public Mono<Tarefas> saveTarefas(@RequestBody Tarefas tarefas){
		tarefas = this.tarefasService.save(tarefas);
		return Mono.just(tarefas);
	}

}
