package ExerciciosListas.ExercicoListaDeLivros;

import java.util.ArrayList;

public class Estante {
    public static void main(String[] args) {

        ArrayList<Livro> listaDeLivros = new ArrayList<>();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("A Sutil Arte de Ligar o F*da-se", "Mark Manson", 2016);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro4 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);


        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);
        listaDeLivros.add(livro4);

        System.out.println("\uD83D\uDCDA Todos os livros: ");
        for (Livro livro : listaDeLivros) {
            System.out.println(livro);
        }


        System.out.println("\n\uD83D\uDCD8 Livros lançados após 2010: ");
        for (Livro livro : listaDeLivros) {
            if (livro.getAnoPublicacao() > 2010) {
                System.out.println(livro);
            }
        }
    }
}
