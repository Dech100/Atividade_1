package Pinheiro.Pedro;

public class Usuario {
    public Usuario(String nome){
        this.nome = nome;
    }

    private String nome;
    private String senha;
    private String email;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}