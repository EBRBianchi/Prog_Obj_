package AULA_02.ECOMERCE;

public class Comercio {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3500.00;
        produto1.estoque = 10;

        produto1.mostrarInfos();
        produto1.vender(5);
    }
}
