package org.com.livro.livro.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.com.livro.livro.domain.entity.Livros;
import org.com.livro.livro.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    public Livros salvarLivro(Livros livro) {
        return livroRepository.save(livro);
    }

    public List<Livros> buscarLivros() {
        return livroRepository.findAll();
    }

    public void deletar(long id) {
        livroRepository.deleteById(id);
    }

    public Livros buscarPorid(long id) {
        return livroRepository.findById(id).orElse(new Livros());
    }

    public Livros editarLivros(Livros livro, long id) {
        return  livroRepository.findById(id).map(livros -> {

           return livroRepository.save(livro);

        }).orElseThrow();
    }
}
