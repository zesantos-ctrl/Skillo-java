package br.com.alura.Screenmatch.Calculo;


import br.com.alura.Screenmatch.Modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;


   public void inclui(Title titulo) {
       this.tempoTotal += titulo.getDuracaoEmMinutos();
   }


    public int getTempoTotal() {
        return tempoTotal;
    }
}
