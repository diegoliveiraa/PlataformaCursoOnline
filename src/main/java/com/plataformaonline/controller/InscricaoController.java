package com.plataformaonline.controller;

import com.plataformaonline.dto.AlunoDTO;
import com.plataformaonline.dto.CursoDTO;
import com.plataformaonline.dto.InscricaoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.plataformaonline.entidades.Inscricao;
import com.plataformaonline.repositorio.InscricaoRepositorio;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {
	@Autowired
	private InscricaoRepositorio inscricaoRepositorio;

	// Listar todas as inscrições
	@GetMapping
	public List<InscricaoDTO> listarInscricoes() {
		List<Inscricao> inscricoes = inscricaoRepositorio.findAll();
		return inscricoes.stream().map(inscricao -> {
			AlunoDTO alunoDTO = InscricaoPopulator.converterAlunoParaDTO(inscricao.getAluno());
			CursoDTO cursoDTO = InscricaoPopulator.converterCursoParaDTO(inscricao.getCurso());
			return new InscricaoDTO(inscricao.getId(), alunoDTO, cursoDTO, inscricao.getDataInscricao());
		}).collect(Collectors.toList());
	}

	// Inscrever um aluno em um curso
	@PostMapping
	public InscricaoDTO inscreverAluno(@RequestBody Inscricao inscricao) {
		Inscricao inscricaoSalva = inscricaoRepositorio.save(inscricao);
		AlunoDTO alunoDTO = InscricaoPopulator.converterAlunoParaDTO(inscricaoSalva.getAluno());
		CursoDTO cursoDTO = InscricaoPopulator.converterCursoParaDTO(inscricaoSalva.getCurso());
		return new InscricaoDTO(inscricaoSalva.getId(), alunoDTO, cursoDTO, inscricaoSalva.getDataInscricao());
	}

	// Listar todos os cursos em que um aluno está inscrito
	@GetMapping("/alunos/{id}")
	public List<CursoDTO> listarCursosDoAluno(@PathVariable Long id) {
		// Buscar todas as inscrições do aluno
		List<Inscricao> inscricoes = inscricaoRepositorio.findByAlunoId(id);

		// Converter para DTOs utilizando o InscricaoPopulator
		return inscricoes.stream().map(inscricao -> InscricaoPopulator.converterCursoParaDTO(inscricao.getCurso()))
				.collect(Collectors.toList());
	}

	// Listar todos os alunos inscritos em um curso
	@GetMapping("/cursos/{id}")
	public List<AlunoDTO> listarAlunosDoCurso(@PathVariable Long id) {
		// Buscar todas as inscrições do curso
		List<Inscricao> inscricoes = inscricaoRepositorio.findByCursoId(id);

		// Converter para DTOs utilizando o InscricaoPopulator
		return inscricoes.stream().map(inscricao -> InscricaoPopulator.converterAlunoParaDTO(inscricao.getAluno()))
				.collect(Collectors.toList());
	}
}
