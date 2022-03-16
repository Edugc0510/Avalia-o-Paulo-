package br.com.senai;

import br.com.senai.model.Conta;

//Classe
public class Main {
    public static void main(String args []){
        Conta conta1 = new Conta();
        conta1.setNumeroAgencia("123-4");
        conta1.setNumeroConta("12345-6");
        conta1.depositar(150);
        System.out.println(conta1);
        conta1.sacar(30);
        System.out.println(conta1);

        Conta conta2 = new Conta();
        conta2.setNumeroAgencia("123-4");
        conta2.setNumeroConta("12566-7");
        conta2.depositar(200);
        System.out.println(conta2);
        conta2.sacar(154);
        System.out.println(conta2);
    }
}
