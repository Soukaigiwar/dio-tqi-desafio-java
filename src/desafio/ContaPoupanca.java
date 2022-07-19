package desafio;

public class ContaPoupanca extends Conta {

    private String tipoConta = "Poupanca";

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#############################");
        System.out.println("#          Extrato          #");
        System.out.println("#############################");
        super.imprimirDetalhes(tipoConta);
    }
}
