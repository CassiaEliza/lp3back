package com.example.aula.core.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Tarefas extends AbstractEntity {
	@Column 
	private String titulo;
	@Column 
	private String descricao; 
	@Column
	private Date dInicio;
	@Column
	private Date dFim;
	
	
	

}
