package exercicios.exercicios_0508;

import java.util.ArrayList;
import java.util.Scanner;

public class FilmeMain {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Filme> filmes = new ArrayList<Filme>();

    public static void main(String[] args) {
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Filme filme3 = new Filme();

        filme1.titulo = "a";
        filme1.genero = "ação";
        filme1.ano = 2000;
        filmes.add(filme1);

        filme2.titulo = "b";
        filme2.genero = "romance";
        filme2.ano = 2000;
        filmes.add(filme2);

        filme3.titulo = "c";
        filme3.genero = "comédia";
        filme3.ano = 2000;
        filmes.add(filme3);

        for(Filme filme : filmes){
            System.out.println(filme.exibirFicha());
        }



    }
}
