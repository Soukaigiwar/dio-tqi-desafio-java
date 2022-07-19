package desafio;

public interface InterfaceConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void investir(double valor, Conta contaInvestimento, double meses);
    void imprimirExtrato();
}
