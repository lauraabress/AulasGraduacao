package exercicios.exercicios_0508;

public class Filme {
    String titulo;
    String genero;
    int ano;


    public String exibirFicha() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", ano=" + ano +
                '}';
    }
}
