package br.com.livraria.www;

import br.com.livraria.www.Objetos.Livro;
import br.com.livraria.www.Objetos.Revista;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = Livraria.getInstance();

        Livro livro1 = new Livro("Orgulho e preconceito","Jorge", "dasdsa",89.99);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "Editora A", 59.99);
        Revista revista1 = new Revista("Revista de Arquitetura", "Arq&Design", 19.99);
        Revista revista2 = new Revista("Revista de Moda", "FashionMag", 9.99);

        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);
        livraria.adicionarRevista(revista1);
        livraria.adicionarRevista(revista2);

        livraria.exibirLivros();
        livraria.exibirRevistas();

    }
}