package service;

import model.Livro;

import java.util.TreeSet;

public class Catalogo {
    private TreeSet<Livro> treecatalogo;

    public Catalogo (){
        this.treecatalogo = new TreeSet<>();
    }


    public void adicionarLivro(Livro livro){
        treecatalogo.add(livro);
    }

    public void listarLivros(){
        for (Livro l : treecatalogo){
            System.out.println("Titulo: " + l.getTitulo());
        }
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro l : treecatalogo) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
}