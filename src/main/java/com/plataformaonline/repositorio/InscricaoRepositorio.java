package com.plataformaonline.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plataformaonline.entidades.Inscricao;
import java.util.List;

public interface InscricaoRepositorio extends JpaRepository<Inscricao, Long> {
	List<Inscricao> findByAlunoId(Long alunoId);

	List<Inscricao> findByCursoId(Long cursoId);
}
