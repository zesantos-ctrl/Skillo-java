package br.com.alura.Screenmatch.Modelos;


import br.com.alura.Screenmatch.Calculo.Classificado;

public class movie extends Title implements Classificado {
    private String diretor;

    //arraylist
    public movie(String nome, int anoDeLancamento) {
      super(nome,anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegarMedia() / 2;
    }


    //começo de ArrayList
    @Override
    public String toString() {
    return "Filme: " + this.getNome() +  "(" + this.getAnoDeLancamento() + ")";
    }
}