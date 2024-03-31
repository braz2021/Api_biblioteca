package org.com.livro.livro.repository;

import org.com.livro.livro.domain.entity.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LivroRepository extends JpaRepository<Livros, Long> {

}
