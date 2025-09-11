package Principal;

import br.com.alura.Screenmatch.Modelos.Filme;
import br.com.alura.Screenmatch.Modelos.Series;
import br.com.alura.Screenmatch.Modelos.Titulo;
import java.util.ArrayList;

public class principalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Carros", 2005);
        outroFilme.avalia(9);
        Filme filmeDoZe = new Filme("Incriveis", 2004);
        filmeDoZe.avalia(10);
        Series horaDeAventura = new Series("Hora de aventura", 2010);

        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
}
