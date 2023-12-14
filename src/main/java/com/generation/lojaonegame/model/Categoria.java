package com.generation.lojaonegame.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name ="tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "A Descrição é obrigatório para categoria")
	@Size(min = 15, max = 250, message = "O atributo título deve conter no mínimo 15 e no máximo 250 caracteres")
	@Column(length = 250)
	private String descricao;
	
	@NotNull(message = "O nome é obrigatorio para categoria")
	@Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
	@Column(length = 100)
	private String nome;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
