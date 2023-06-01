package br.com.livraria.www.Objetos;

public class Livro {
    String titulo;
    String autor;
    String editora;
    double valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Livro(String titulo, String autor, String editora, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.valor = valor;
    }
}
