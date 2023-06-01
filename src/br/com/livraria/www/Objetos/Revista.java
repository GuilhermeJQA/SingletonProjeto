package br.com.livraria.www.Objetos;

public class Revista {
    String titulo;
    String revista;
    double valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRevista() {
        return revista;
    }

    public void setRevista(String revista) {
        this.revista = revista;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Revista(String titulo, String revista, double valor) {
        this.titulo = titulo;
        this.revista = revista;
        this.valor = valor;
    }
}
