package org.com.livro.livro.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "LIVRO", schema = "BIBLIOTECA")
public class Livros {

    @Id
    @Column(name = "ID_LIVRO")
   @GeneratedValue(generator = "SEQ_LIVRO", strategy = GenerationType.SEQUENCE)
//    @SequenceGenerator(name = "SEQ_LIVRO", sequenceName = "SEQ_LIVRO", initialValue = 1 )
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "CATEGORIA", nullable = false)
    private String categoria;

    @Column (name = "NOME_AUTOR",nullable = false)
    private  String nomeAutor;

    @Column(name = "EDITORA")
    private  String editora;

    @Column(name = "VERSAO")
    private String versao;

}
//public class Usuario {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String nome;
//    private String email;
//    private String telefone;
//
//
//}

