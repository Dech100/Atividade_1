package Pinheiro.Pedro;
//Nome: Pedro Henrique Soares Pinheiro RA: 17.02005-0

public class Usuario extends Conta{

    //definindo variaveis
    private String nome;
    private String senha;
    private String email;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
//Função para criação de conta
    public void criarconta(String nome, String senha, String email, int id, Double saldo){
        this.setNome(nome);
        this.setSenha(senha);
        this.setEmail(email);
        this.setId(id);
        this.setSaldo(saldo);

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome=" + nome+ '\'' +
                ", senha=" + senha + '\'' +
                ", email=" + email + '\'' +
                ", id=" + this.getId() +'\'' +
                ", Saldo=" + this.getSaldo() + '\'' +
                '}';
    }

}