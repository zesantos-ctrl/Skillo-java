package PrimeiraAplicação.AulaPrincipal;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        //Usado para um LOOP
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média de avaliação " + mediaAvaliacao/3);


    }
}
