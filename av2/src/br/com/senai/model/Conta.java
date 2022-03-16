package br.com.senai.model;

//Classe
public class Conta {
    //Atributos
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;

    //Métodos
    public double depositar(double valor){
        return saldo += valor;
    }

    public  double sacar(double valor){
        if (valor  <= saldo){
            saldo -= valor;
            return valor;
        } else {
            return 0;
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString(){
        return "Agência:" + numeroAgencia +
                "Conta Corrente" + numeroConta +
                "\nSaldo: " + saldo;
    }
}
