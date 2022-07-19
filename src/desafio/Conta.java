package desafio;

public abstract class Conta implements InterfaceConta{

    private static final Integer AGENCIA_PADRAO = 1;
    private static Integer SEQUENCIAL = 1;
    protected Integer agencia;
    protected Integer numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirDetalhes(String tipoConta) {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %04d", this.agencia));
        System.out.println(String.format("Conta %s: %06d-0", tipoConta, this.numeroConta));
        System.out.println(String.format("Saldo: R$ %.2f\n", this.saldo));
    }

    protected void extratoConsolidado(){
        System.out.println(getSaldo());
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void investir(double valor, Conta contaInvestimento, double meses) {
        double rendimento = 0d;

        if(valor <= saldo * 0.1 && saldo > 0) {
            this.sacar(valor);
            contaInvestimento.depositar(valor);
            rendimento = (contaInvestimento.saldo * Math.pow(1.05, meses)) - valor;
            contaInvestimento.depositar(rendimento);
            System.out.println(String.format("Seu dinheiro rendeu R$ %.2f\ndepois de %.0f meses.", rendimento, meses));
        } else {
            System.out.println("Nao eh seguro comprometer mais\nque 10% do seu saldo.\n");
        }
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getNome() {
        return cliente;
    }

    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    public void investir() {

    }
}
