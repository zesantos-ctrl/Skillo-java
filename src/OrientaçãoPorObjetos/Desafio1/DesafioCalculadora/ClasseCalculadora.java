package OrientaçãoPorObjetos.Desafio1.DesafioCalculadora;

public class ClasseCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numeroInteiro = 5;
        int dobroInteiro = calculadora.calcular(numeroInteiro);
        System.out.println("O dobro de " + numeroInteiro + " é " + dobroInteiro);

        double numeroDecimal = 3.14;
        double dobroDecimal = calculadora.calcular(numeroDecimal);
        System.out.println("O dobro de " + numeroDecimal + " é " + dobroDecimal);
    }
}
