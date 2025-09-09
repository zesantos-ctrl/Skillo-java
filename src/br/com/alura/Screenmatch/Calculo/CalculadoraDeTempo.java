package br.com.alura.Screenmatch.Calculo;


import br.com.alura.Screenmatch.Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


   public void inclui(Titulo titulo) {
       this.tempoTotal += titulo.getDuracaoEmMinutos();
   }


    public int getTempoTotal() {
        return tempoTotal;
    }
}
