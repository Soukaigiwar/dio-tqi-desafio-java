package desafio;

public class ExtratoConsolidado extends Conta{

    public ExtratoConsolidado(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-----------------------------");
        System.out.println("Extrato Consolidado");
    }
}
