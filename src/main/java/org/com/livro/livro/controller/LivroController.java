package org.com.livro.livro.controller;


import lombok.AllArgsConstructor;
import org.com.livro.livro.domain.entity.Livros;
import org.com.livro.livro.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@AllArgsConstructor
public class LivroController {


    private final LivroService livroService;

    @PostMapping
    public Livros adicionarLivro(@RequestBody Livros livro) {
        return livroService.salvarLivro(livro);
    }

    @GetMapping
    public List<Livros> buscarLivros() {
        return livroService.buscarLivros();
    }
    @DeleteMapping("/{id}")

    public void delete(@PathVariable long id){
        livroService.deletar(id);
    }

    @GetMapping("/{id}")
    public Livros buscarPorid(@PathVariable long id){
        return livroService.buscarPorid(id);
    }

    @PutMapping("/{id}")
    public Livros editar(@RequestBody Livros livro,@PathVariable long id){
        return livroService.editarLivros(livro, id);
    }
}


