package OrientaçãoPorObjetos.Desafio1.DesafioCarro;

public class Carro {
    String modelo;
    String cor;
    int ano;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
    int calcularIdade (int anoAtual) {
        return anoAtual - ano;
    }
}
