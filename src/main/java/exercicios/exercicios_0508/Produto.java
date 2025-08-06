package exercicios.exercicios_0508;

public class Produto {

    String nomeProduto;
    double valorProduto;
    int qtdEstoque;
    String unidadeMedida;

    void verificacaoValor(){
        if(valorProduto < 10){
            System.out.printf("O produto: %s deverá ganhar um aumento de 10%%\nValor após o aumento: R$ %.2f", this.nomeProduto, this.valorProduto+((this.valorProduto*10)/100));
        }
    }

}
