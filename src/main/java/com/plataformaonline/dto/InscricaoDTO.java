package com.plataformaonline.dto;

import java.util.Date;

public class InscricaoDTO {

	private Long id;
	private AlunoDTO alunoId;
	private CursoDTO cursoId;
	private Date dataInscricao;

	// Construtores, Getters e Setters

	public InscricaoDTO(Long id, AlunoDTO alunoDTO, CursoDTO cursoDTO, Date dataInscricao) {
		this.id = id;
		this.alunoId = alunoDTO;
		this.cursoId = cursoDTO;
		this.dataInscricao = dataInscricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AlunoDTO getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(AlunoDTO alunoId) {
		this.alunoId = alunoId;
	}

	public CursoDTO getCursoId() {
		return cursoId;
	}

	public void setCursoId(CursoDTO cursoId) {
		this.cursoId = cursoId;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
}
