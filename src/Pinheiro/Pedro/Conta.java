package Pinheiro.Pedro;
//Nome: Pedro Henrique Soares Pinheiro RA: 17.02005-0

public abstract class Conta {

    //Atributos das classe
    private double saldo;
    private int id;

    //Criando setter e getter para facilidade
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Criando setter e getter para facilidade
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}