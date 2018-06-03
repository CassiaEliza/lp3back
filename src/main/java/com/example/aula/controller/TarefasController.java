package com.example.aula.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.aula.core.model.entity.Tarefas;

import reactor.core.publisher.Mono;
@RequestMapping("/tarefas")

public interface TarefasController {
	@GetMapping ("/all")
	Mono<List<Tarefas>> getTarefas();
	
	@PostMapping ("/save")
	Mono<Tarefas> saveTarefas(@RequestBody Tarefas tarefas);

}
