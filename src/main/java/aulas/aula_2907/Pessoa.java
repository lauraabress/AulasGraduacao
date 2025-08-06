package aulas.aula_2907;

public class Pessoa {

    String nome;
    int idade;
    String cpf;
    double peso;
    double altura;
    int codigo;
    double salario;
    boolean cansaco;

    void andar() {
        if (cansaco) {
            System.out.printf("O %s precisa descansar", this.nome);

            /*
             *  %d para inteiros
             *  %n \n para pular linha
             *  %f float double
             *  %.2f buscar por apenas 2 casas decimais
             *  %.4f busca por 4 casas decimais
             *  %s String
             *  %b boolean
             */

        } else {
            System.out.printf("O %s pode praticar exercicios, como andar", this.nome);
        }
    }

    void comer() {
        System.out.println("Irei comer uma fruta");
    }
}
