package br.senai.sp.escolamvc.repository;

import br.senai.sp.escolamvc.model.Aluno;
import br.senai.sp.escolamvc.model.Professor;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findAlunosByNomeContaining(String nome);

    Long id(Long id);

    List<Aluno> findAlunoByCpf(@NotEmpty(message = "O campo CPF deve ser preenchido") @CPF(message = "O CPF informado deve ser válido") String cpf);
}
