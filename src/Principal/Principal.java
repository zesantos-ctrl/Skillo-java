package Principal;

import br.com.alura.Screenmatch.Calculo.CalculadoraDeTempo;
import br.com.alura.Screenmatch.Calculo.Recomendacao;
import br.com.alura.Screenmatch.Modelos.Episodio;
import br.com.alura.Screenmatch.Modelos.movie;
import br.com.alura.Screenmatch.Modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        movie myMovie = new movie("O poderoso chefão", 1970);
        myMovie.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + myMovie.getDuracaoEmMinutos());

        myMovie.exibirFicha();
        myMovie.avalia(8);
        myMovie.avalia(5);
        myMovie.avalia(10);
        System.out.println("Total de avalições: " + myMovie.getTotalDeAvaliacoes());
        System.out.println(myMovie.pegarMedia());


        Series horaDeAventura  = new Series("Hora de aventura", 2010);
        horaDeAventura.exibirFicha();
        horaDeAventura.setTemporadas(10);
        horaDeAventura.setEpisodiosPorTemporadas(283);
        horaDeAventura.setMinutosPorEpisodios(11);
        System.out.println("Duração da serie: " + horaDeAventura.getDuracaoEmMinutos());

        movie anotherMovie = new movie("Carros", 2005);
        anotherMovie.setDuracaoEmMinutos(120);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(anotherMovie);
        calculadora.inclui(horaDeAventura);
        System.out.println(calculadora.getTempoTotal());


        Recomendacao filtro = new Recomendacao();
        filtro.filtra(myMovie);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(horaDeAventura);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        //começo de arrayList
        movie filmeDoZe = new movie("Incriveis", 2004);
        filmeDoZe.setDuracaoEmMinutos(200);
        filmeDoZe.avalia(9);

        ArrayList<movie> listasDeFilmes = new ArrayList<>();
        listasDeFilmes.add(filmeDoZe);
        listasDeFilmes.add(myMovie);
        listasDeFilmes.add(anotherMovie);
        System.out.println("Tamanho da lista: " + listasDeFilmes.size());
        System.out.println("Primeiro filme: " + listasDeFilmes.get(0).toString());


    }
}
