package AULA_02.CONTA;

public class ContaBancaria {
    String titular;
    double saldo;
    void mostrarInfos(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        if (saldo < 0) {
            System.out.println("Saldo negativo!");
        } else {
            System.out.println("Saldo positivo!");
        }
    }
    void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Saldo atual: " + saldo);
        }
    void sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        }
        else {
            System.out.println("Saldo insuficiente para o saque.");
            
            
        }
    }
}

