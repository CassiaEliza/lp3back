package com.example.aula.core.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;



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
public class Alocacao extends AbstractEntity {
	@Column 
	private String tituloT;
	@Column 
	private String nomeP;
}
