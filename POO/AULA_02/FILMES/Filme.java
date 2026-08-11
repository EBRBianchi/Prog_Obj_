package AULA_02.FILMES;

public class Filme {
    String nome;
    String genero;
    int duracao;
    double nota;
    boolean assistido;
    void mostrarInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Nota: " + nota);
        System.out.println("Assistido: " + assistido);
    }
}
