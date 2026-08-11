package AULA_02.FILMES;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Vingadores: Ultimato";
        filme1.genero = "Ação";
        filme1.duracao = 181;
        filme1.nota = 8.4;
        filme1.assistido = true;

        filme1.mostrarInfos();
        Filme filme2 = new Filme();
        filme2.nome = "O Poderoso Chefão";
        filme2.genero = "Crime";
        filme2.duracao = 175;
        filme2.nota = 9.2;
        filme2.assistido = false;

        filme2.mostrarInfos();
    }
}
