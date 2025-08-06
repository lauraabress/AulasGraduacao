package exercicios.exercicios_0508;

import java.util.Scanner;

public class ProdutosMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Produto produto = new Produto();

        System.out.print("Nome do Produto: ");
        produto.nomeProduto = scanner.nextLine();

        System.out.print("Valor do Produto: ");
        produto.valorProduto = Double.parseDouble(scanner.nextLine());

        System.out.print("Quantidade em Estoque do Produto: ");
        produto.qtdEstoque = Integer.parseInt(scanner.nextLine());

        System.out.print("Unidade de Medida do Produto: ");
        produto.unidadeMedida = scanner.nextLine();

        System.out.printf("\nO nome do produto é %s\n", produto.nomeProduto);
        System.out.printf("O valor do produto é %.2f\n", produto.valorProduto);
        System.out.printf("A quantidade em estoque do produto é %d\n", produto.qtdEstoque);
        System.out.printf("A unidade de medida do produto é %s\n", produto.unidadeMedida);
        produto.verificacaoValor();


    }
}
