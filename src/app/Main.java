package app;

import model.Livro;
import service.Catalogo;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Livro livro1 = new Livro("How to be rich", "Guilherme Varella", "drama", 120);
        Livro livro2 = new Livro("Teste", "monica", "teste", 49);
        Livro livro3 = new Livro("Clean Code", "João Pedro", "Educativo", 80);

        catalogo.adicionarLivro(livro1);
        catalogo.adicionarLivro(livro2);
        catalogo.adicionarLivro(livro3);

        System.out.println("Listando livros");
        catalogo.listarLivros();

        Livro resultado = catalogo.buscarPorTitulo("marcelo");
        if (resultado != null) {
            System.out.println("Livro encontrado:");
            System.out.println("Título: " + resultado.getTitulo());
            System.out.println("Autor: " + resultado.getAutor());
            System.out.println("Gênero: " + resultado.getGenero());
            System.out.println("Preço: R$" + resultado.getPreco());
        } else {
            System.out.println("Livro não encontrado.");
        }

    }
}