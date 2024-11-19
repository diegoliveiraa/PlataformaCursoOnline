package com.plataformaonline.controller;

import com.plataformaonline.dto.AlunoDTO;
import com.plataformaonline.entidades.Aluno;
import com.plataformaonline.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	@Autowired
	private AlunoRepositorio alunoRepositorio;

	@PostMapping
	public AlunoDTO salvarAluno(@RequestBody AlunoDTO alunoDTO) {
		// Converter o DTO para a entidade Aluno
		Aluno aluno = new Aluno();
		aluno.setNome(alunoDTO.getNome());
		aluno.setEmail(alunoDTO.getEmail());
		aluno.setDataCadastro(alunoDTO.getDataCadastro());

		// Salvar o aluno no banco de dados
		Aluno alunoSalvo = alunoRepositorio.save(aluno);

		// Usar o Populator para converter a entidade Aluno para o DTO
		return InscricaoPopulator.converterAlunoParaDTO(alunoSalvo);
	}
}
