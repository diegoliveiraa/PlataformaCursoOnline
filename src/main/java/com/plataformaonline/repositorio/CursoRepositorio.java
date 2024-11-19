package com.plataformaonline.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plataformaonline.entidades.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
	// Outros métodos específicos para Curso, se necessário
}
