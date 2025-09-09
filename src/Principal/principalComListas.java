package Principal;

import br.com.alura.Screenmatch.Modelos.movie;
import br.com.alura.Screenmatch.Modelos.Series;
import br.com.alura.Screenmatch.Modelos.Title;
import java.util.ArrayList;

public class principalComListas {
    public static void main(String[] args) {
        movie myMovie = new movie("O poderoso chefão", 1970);
        myMovie.avalia(6);
        movie outroFilme = new movie("Carros", 2005);
        outroFilme.avalia(9);
        movie filmeDoZe = new movie("Incriveis", 2004);
        filmeDoZe.avalia(10);
        Series horaDeAventura = new Series("Hora de aventura", 2010);

        ArrayList<Title> list = new ArrayList<>();
        list.add(filmeDoZe);
        list.add(myMovie);
        list.add(outroFilme);
        list.add(horaDeAventura);
        for (Title item: list) {
            System.out.println(item.getNome());
            movie filme = (movie) item; //Casting explicito
            System.out.println("Classificação " + filme.getClassificacao());

        }
    }
}
