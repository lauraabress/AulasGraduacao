package aulas.aula_0508;

import java.util.Scanner;

public class FuncionarioMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        System.out.print("Nome do Funcionário: ");
        funcionario.nomeFuncionario = scanner.nextLine();

        System.out.print("Salário do Funcionário: ");
        funcionario.salarioFuncionario = Double.parseDouble(scanner.nextLine());

        System.out.print("CPF do Funcionário: ");
        funcionario.cpfFuncionario = scanner.nextLine();

        System.out.print("Cargo do Funcionário: ");
        funcionario.cargoFuncionario = scanner.nextLine();

        System.out.print("O Funcionário recebeu aumento nos úlltimos 12 meses?\n1. SIM\n2. NÃO");
        funcionario.aumentoFuncionario = Integer.parseInt(scanner.nextLine());

        funcionario.codFuncionario = 3;

        System.out.printf("\nO código do funcionário é %d\n", funcionario.codFuncionario);
        System.out.printf("O nome do funcionário é %s\n", funcionario.nomeFuncionario);
        System.out.printf("O CPF do funcionário é %s\n", funcionario.cpfFuncionario);
        System.out.printf("O salário do funcionário é %.2f\n", funcionario.salarioFuncionario);
        System.out.printf("O cargo do funcionário é %s\n", funcionario.cargoFuncionario);

        funcionario.salarioAumento();
        funcionario.calculaBonus();
    }
}
