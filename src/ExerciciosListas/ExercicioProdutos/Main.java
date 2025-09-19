package ExerciciosListas.ExercicioProdutos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProduto = new ArrayList<>();

        Produto produto1 = new Produto("Coxa de frango", 10);
        Produto produto2 = new Produto("Coca-cola", 11.00);
        Produto produto3 = new Produto("Leite", 5.10);
        Produto produto4 = new Produto("Café", 31.40);


        listaDeProduto.add(produto1);
        listaDeProduto.add(produto2);
        listaDeProduto.add(produto3);
        listaDeProduto.add(produto4);

        System.out.println("Tamanho da lista: " + listaDeProduto.size());

        Produto maisCaro = listaDeProduto.get(0);
        for (Produto produto : listaDeProduto) {
            if (produto.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto;
            }
        }
        System.out.println("Produto mais caro: " + maisCaro.getNome() + " - R$"+ maisCaro.getPreco());
    }
}
