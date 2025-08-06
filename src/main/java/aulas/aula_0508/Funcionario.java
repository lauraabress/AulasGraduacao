package aulas.aula_0508;

public class Funcionario {
    int codFuncionario;
    String nomeFuncionario;
    double salarioFuncionario;
    String cpfFuncionario;
    String cargoFuncionario;
    int aumentoFuncionario;

    void intervalo(){
        System.out.print("Já está na hora do funcionario sair para almoçar");
    }

    void salarioAumento(){
        if(salarioFuncionario <= 3000){
            System.out.printf("O %s terá um aumento de 10%%", this.nomeFuncionario);
        } else if(salarioFuncionario >= 5000) {
            System.out.println("Será descontado do funcionário 10% do salário");
        }
    }

    void calculaBonus(){
        if(aumentoFuncionario == 2){
            System.out.printf("\nO salário de %s teve um adicional de 10%%\nO salário foi para: R$ %.2f", nomeFuncionario, salarioFuncionario+((salarioFuncionario*10)/100));
        }
    }

}

