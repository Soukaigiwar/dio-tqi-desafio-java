package desafio;

public class ContaInvestimento extends Conta{
    private String tipoConta = "Investimento";

    public ContaInvestimento(Cliente cliente) {
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
