package Principal;

import br.com.alura.Screenmatch.Calculo.CalculadoraDeTempo;
import br.com.alura.Screenmatch.Calculo.Recomendacao;
import br.com.alura.Screenmatch.Modelos.Episodio;
import br.com.alura.Screenmatch.Modelos.Filme;
import br.com.alura.Screenmatch.Modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFicha();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avalições: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegarMedia());


        Series horaDeAventura  = new Series("Hora de aventura", 2010);
        horaDeAventura.exibirFicha();
        horaDeAventura.setTemporadas(10);
        horaDeAventura.setEpisodiosPorTemporadas(283);
        horaDeAventura.setMinutosPorEpisodios(11);
        System.out.println("Duração da serie: " + horaDeAventura.getDuracaoEmMinutos());

        Filme anotherMovie = new Filme("Carros", 2005);
        anotherMovie.setDuracaoEmMinutos(120);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(anotherMovie);
        calculadora.inclui(horaDeAventura);
        System.out.println(calculadora.getTempoTotal());


        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(horaDeAventura);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        //começo de arrayList
        Filme filmeDoZe = new Filme("Incriveis", 2004);
        filmeDoZe.setDuracaoEmMinutos(200);
        filmeDoZe.avalia(9);

        ArrayList<Filme> listasDeFilmes = new ArrayList<>();
        listasDeFilmes.add(filmeDoZe);
        listasDeFilmes.add(meuFilme);
        listasDeFilmes.add(anotherMovie);
        System.out.println("Tamanho da lista: " + listasDeFilmes.size());
        System.out.println("Primeiro filme: " + listasDeFilmes.get(0).toString());


    }
}
