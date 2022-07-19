package desafio;

public class Cliente {

    private String nome;

    protected void imprimirClientes(){
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
