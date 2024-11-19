package com.plataformaonline.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plataformaonline.entidades.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

}
