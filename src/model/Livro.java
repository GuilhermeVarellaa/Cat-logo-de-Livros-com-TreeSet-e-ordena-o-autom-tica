package model;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private String genero;
    private int preco;

    public Livro(String titulo, String autor, String genero, int preco){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Livro outro) {
        int comparacaoTitulo = this.titulo.compareTo(outro.titulo);
        if (comparacaoTitulo != 0) {
            return comparacaoTitulo;
        }
        return this.autor.compareTo(outro.autor);
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", preco=" + preco + "]";
    }


}
