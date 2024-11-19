package com.plataformaonline.controller;

import com.plataformaonline.dto.CursoDTO;
import com.plataformaonline.entidades.Curso;
import com.plataformaonline.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	@Autowired
	private CursoRepositorio cursoRepositorio;

	@PostMapping
	public CursoDTO salvarCurso(@RequestBody CursoDTO cursoDTO) {
		// Converter o DTO para a entidade Curso
		Curso curso = new Curso();
		curso.setNome(cursoDTO.getNome());
		curso.setDescricao(cursoDTO.getDescricao());
		curso.setDataCriacao(cursoDTO.getDataCriacao());

		// Salvar o curso no banco de dados
		Curso cursoSalvo = cursoRepositorio.save(curso);

		// Usar o Populator para converter a entidade Aluno para o DTO
		return InscricaoPopulator.converterCursoParaDTO(cursoSalvo);
	}
}
