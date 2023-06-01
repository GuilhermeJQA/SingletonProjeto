package br.com.livraria.www;

import br.com.livraria.www.Objetos.Livro;
import br.com.livraria.www.Objetos.Revista;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private static Livraria instance;
    private List<Livro> livros;
    private List<Revista> revistas;

    private Livraria() {
        livros = new ArrayList<>();
        revistas = new ArrayList<>();
    }

    public static Livraria getInstance() {
        if (instance == null) {
            instance = new Livraria();
        }
        return instance;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarRevista(Revista revista) {
        revistas.add(revista);
    }

    public void exibirLivros() {
        System.out.println("\nLivros na livraria:");
        for (Livro livro : livros) {
            System.out.println("\nTítulo: "+livro.getTitulo());
            System.out.println("Autor: "+livro.getAutor());
            System.out.println("Editora: "+livro.getEditora());
            System.out.println("Valor: R$"+livro.getValor());
        }
    }

    public void exibirRevistas() {
        System.out.println("\nRevistas na livraria:");
        for (Revista revista : revistas) {
            System.out.println("\nTítulo: "+revista.getTitulo());
            System.out.println("Revista: "+revista.getRevista());
            System.out.println("Valor: R$"+revista.getValor());
        }
    }
}
