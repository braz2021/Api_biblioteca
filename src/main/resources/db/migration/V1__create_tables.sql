create sequence BIBLIOTECA.SEQ_LIVRO START WITH 1 INCREMENT BY 1 minvalue 1 maxvalue 99999999;
CREATE TABLE BIBLIOTECA.LIVRO
(
    ID_LIVRO   NUMBER DEFAULT BIBLIOTECA.SEQ_LIVRO.NEXTVAL PRIMARY KEY,
    NOME       VARCHAR2(50) NOT NULL,
    CATEGORIA  VARCHAR2(60) NOT NULL,
    NOME_AUTOR VARCHAR2(60) NOT NULL,
    EDITORA varchar2(60),
    VERSAO VARCHAR2(60)
);


-- Inserindo alguns dados na tabela LIVROS.LIVROS usando a sequência SEQ_LIVRO
INSERT INTO BIBLIOTECA.LIVRO (ID_LIVRO, NOME, CATEGORIA, NOME_AUTOR, EDITORA, VERSAO) VALUES
(SEQ_LIVRO.NEXTVAL, 'O Senhor dos Anéis', 'Fantasia', 'J.R.R. Tolkien', 'Editora A', '1ª edição'),
(SEQ_LIVRO.NEXTVAL, 'Harry Potter e a Pedra Filosofal', 'Fantasia', 'J.K. Rowling', 'Editora B', '1ª edição'),
(SEQ_LIVRO.NEXTVAL, '1984', 'Ficção Científica', 'George Orwell', 'Editora C', '1ª edição'),
(SEQ_LIVRO.NEXTVAL, 'Dom Quixote', 'Romance', 'Miguel de Cervantes', 'Editora D', '1ª edição'),
(SEQ_LIVRO.NEXTVAL, 'A Revolução dos Bichos', 'Fábula', 'George Orwell', NULL, '1ª edição');

