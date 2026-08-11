package AULA_02.ECOMERCE;
public class Produto {
    String nome;
    double preco;
    int estoque;
    void mostrarInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
    }
    void vender(int quantidade){
        if(quantidade <= estoque){
            estoque = estoque - quantidade;
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Estoque atual: " + estoque);
        }
        else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }

}

