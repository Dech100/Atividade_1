package Pinheiro.Pedro;

public class Conta {
    public Usuario getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    //Atributos das classe
    private Usuario cliente;
    private double saldo;
    private int numero;

    //Métodos da classe

    //Construtor da classe
    public Conta(String nomeCliente, double saldoInicial){
        this.saldo = saldoInicial;
        this.cliente = new Usuario(nomeCliente);
        this.numero = 1234;
    }
    public Conta(String nomeCliente, String cpf){
        this.cliente = new Usuario(nomeCliente);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }


    public void visualizarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}