package Pinheiro.Pedro;
import java.util.Random;
//Nome: Pedro Henrique Soares Pinheiro RA: 17.02005-0
//Feito com auxilio de PEDRO HENRIQUE FERREIRA DOMINICHELLI FABRIS
public class Transacoes {
//gerar um numero inteiro de 1000 a 9999
    private int gerarNumeroDeTransacao(){
        Random r = new Random();
        return r.nextInt(9999 -1000) +1000;
        }

        //Verificar Saldo retornando se dá ou não para completar a transação
    private boolean verificarSaldo(Usuario usuario, Double valorDeTransacao){
        if (usuario.getSaldo() < valorDeTransacao){
            return false;
        }else{
            return true;
        }

    }

    //retorna o usuario e o valor da transação
    public String gerarQrCode(Usuario usuario, Double valorDeTransacao){
        int numeroDeTransacao = gerarNumeroDeTransacao();
        return usuario.getId() + ";" + usuario.getNome() + ";" + valorDeTransacao + ";" + numeroDeTransacao;
    }
//
    public void pagamento(Usuario pagante, Usuario recebe, String qrCode){
        String qrCodeSeparado[] = new String[4];
        qrCodeSeparado = qrCode.split(";");
        double valorDeTransacao = Double.parseDouble(qrCodeSeparado[2]);
        if(verificarSaldo(pagante,valorDeTransacao)){
            pagante.setSaldo(pagante.getSaldo()-valorDeTransacao);
            recebe.setSaldo(recebe.getSaldo()+valorDeTransacao);
        }

    }

}
