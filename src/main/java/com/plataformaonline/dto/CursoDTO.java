package com.plataformaonline.dto;

import java.util.Date;

public class CursoDTO {
	private Long id;
	private String nome;
	private String descricao;
	private Date dataCriacao;

	public CursoDTO(Long id, String nome, String descricao, Date date) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.dataCriacao = date;
	}

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
