package br.edu.unichristus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEditoraRepository extends JpaRepository<Editora, Long> {

}
