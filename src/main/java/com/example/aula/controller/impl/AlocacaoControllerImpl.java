package com.example.aula.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import com.example.aula.controller.AlocacaoController;
import com.example.aula.core.model.entity.Alocacao;
import com.example.aula.service.AlocacaoService;

@RestController
public class AlocacaoControllerImpl implements AlocacaoController {

	@Autowired
	AlocacaoService alocacaoService;

	@Override
	public Mono<List<Alocacao>> getAlocacao() {
		List<Alocacao> listaAlunos = this.alocacaoService.getAll();

		return Mono.just(listaAlunos);
	}

	@Override
	public Mono<Alocacao> saveAlocacao(@RequestBody Alocacao alocacao) {
		alocacao = this.alocacaoService.save(alocacao);

		return Mono.just(alocacao);
	}

}
