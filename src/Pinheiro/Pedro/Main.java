package Pinheiro.Pedro;

import java.util.Arrays;

//Nome: Pedro Henrique Soares Pinheiro RA: 17.02005-0
//Feito com auxilio de PEDRO HENRIQUE FERREIRA DOMINICHELLI FABRIS
public class Main {

    public static void main(String[] args) {
        Usuario conta1 = new Usuario();
        Usuario conta2 = new Usuario();
        Usuario conta3 = new Usuario();
        conta1.criarconta("Wing","12345","f",5482,1000.0);
        conta2.criarconta("Exia","12345","f",9542,250.0);
        conta3.criarconta("Barbatos","12345","f",1500,3000.0);

        conta1.toString();
        conta2.toString();
        conta3.toString();

        System.out.println("Estado antes das transações:");
        System.out.println("Saldo de Wing= " + conta1.getSaldo());
        System.out.println("Saldo de Exia= " + conta2.getSaldo());
        System.out.println("Saldo de Barbatos= " + conta3.getSaldo());

        Transacoes transacoes = new Transacoes();
        String qrCode1 = transacoes.gerarQrCode(conta1, 250.0);
        System.out.println(qrCode1);
        transacoes.pagamento(conta2, conta1, qrCode1);
        transacoes.pagamento(conta3, conta1, qrCode1);
        transacoes.pagamento(conta2, conta1, qrCode1);
        String qrCode2 = transacoes.gerarQrCode(conta2, 1000.0);
        System.out.println(qrCode2);
        transacoes.pagamento(conta3, conta2, qrCode2);

        System.out.println("Estado depois das transações:");
        System.out.println("Saldo de Wing= " + conta1.getSaldo());
        System.out.println("Saldo de Exia= " + conta2.getSaldo());
        System.out.println("Saldo de Barbatos= " + conta3.getSaldo());

        conta1.toString();
        conta2.toString();
        conta3.toString();

    }

}
