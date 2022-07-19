package desafio;

public class ContaCorrente extends Conta{

    private String tipoConta = "Corrente";

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("#############################");
        System.out.println("#          Extrato          #");
        System.out.println("#############################");
        super.imprimirDetalhes(tipoConta);
    }
}

