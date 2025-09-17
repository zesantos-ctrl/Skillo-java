package Principal;

import br.com.alura.Screenmatch.Modelos.Filme;
import br.com.alura.Screenmatch.Modelos.Series;
import br.com.alura.Screenmatch.Modelos.Titulo;

import java.util.*;

public class principalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Carros", 2005);
        outroFilme.avalia(9);
        Filme filmeDoZe = new Filme("Incriveis", 2004);
        filmeDoZe.avalia(10);
        Series horaDeAventura = new Series("Hora de aventura", 2010);


        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoZe);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(horaDeAventura);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String>buscarPorArtista = new ArrayList<>();
        System.out.println("\nAntes de ser ordenada");
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Ze");
        buscarPorArtista.add("Luiza");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);
        System.out.println("\nLista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\nOrdenando por ano");
        System.out.println(lista);



    }
}
