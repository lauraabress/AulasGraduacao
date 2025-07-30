package aula_2907;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaMain {
    /// static ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Laura";
        pessoa.idade = 19;
        pessoa.altura = 167;
        pessoa.peso = 70;
        pessoa.codigo = 37;
        pessoa.salario = 37000;
        pessoa.cansaco = true;
        pessoa.andar();
    }

    public static String lerString(){
        return scanner.nextLine();
    }

    public static int lerInt(){
        return Integer.parseInt(scanner.nextLine());
    }

    public static double lerDouble(){
        return Double.parseDouble(scanner.nextLine());
    }

    public static void mostraMsg(String msg){
        System.out.println(msg);
    }

}
