package com.plataformaonline.controller;

import com.plataformaonline.dto.AlunoDTO;
import com.plataformaonline.dto.CursoDTO;
import com.plataformaonline.entidades.Aluno;
import com.plataformaonline.entidades.Curso;

public class InscricaoPopulator {

	// Método para converter Aluno para AlunoDTO
	public static AlunoDTO converterAlunoParaDTO(Aluno aluno) {
		return new AlunoDTO(aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getDataCadastro());
	}

	// Método para converter Curso para CursoDTO
	public static CursoDTO converterCursoParaDTO(Curso curso) {
		return new CursoDTO(curso.getId(), curso.getNome(), curso.getDescricao(), curso.getDataCriacao());
	}
}
