package AULA_02.CONTA;

public class main{
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Eduardo";
        conta1.saldo = 1000.00;

        conta1.mostrarInfos();
        conta1.depositar(500.00);
        conta1.sacar(200.00);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "João";                
        conta2.saldo = -100.00;
        
        conta2.mostrarInfos();
        conta2.depositar(300.00);
        conta2.sacar(500.00);
        
    }
}
