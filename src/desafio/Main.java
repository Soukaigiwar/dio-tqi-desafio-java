package desafio;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Cria o banco
        System.out.println(">>> Cria o Banco");
        Banco banco = new Banco();
        banco.setNome("Banco da Familia Mello");

        // Cria o cliente
        System.out.println(">>> Cria Cliente");
        Cliente sergiomello = new Cliente();
        sergiomello.setNome("Sergio Mello");

        // Cria as 3 contas para Sergio Mello e exibe o extrato consolidado
        System.out.println(">>> cria as contas para cliente");
        Conta cc = new ContaCorrente(sergiomello);
        Conta cp = new ContaPoupanca(sergiomello);
        Conta ci = new ContaInvestimento(sergiomello);
        ExtratoConsolidado extrato = new ExtratoConsolidado(sergiomello);

        // Deposita 5000 na conta corrente (cc)
        System.out.println(">>> Deposita R$ 5000,00 CC");
        cc.depositar(5000);

        // Transfere 1000 para conta poupanca (cp)
        System.out.println(">>> Transfere R$ 1000,00 p/ CP");
        cc.transferir(1000, cp);

        // Exibe o saldo depois de depositar e transferir
        // para conta poupanca
        System.out.println(">>> Exibe extrato consolidado");
        extrato.imprimirExtrato();
        System.out.println(String.format("R$ %.2f\n", cc.saldo + cp.saldo + ci.saldo));

        // Dos 2000 que sobraram na (cc), tenta investir 1000
        // e recebe mensagem de erro pois o valor eh muito alto
        System.out.println(">>> Tenta investir R$ 1000,00\n");
        System.out.println("#############################");
        System.out.println("#    Investir R$ 1000,00    #");
        System.out.println("#############################");
        cc.investir(1000, ci, 5);
        System.out.println(">>> Falha pois tem regra pra investimento.");

        // Baixa a bola e investe agora R$ 300,00 por 5 meses.
        // Agora vai!!
        System.out.println(">>> Agora tenta investir R$ 300,00\n");
        cc.investir(300, ci, 5);

        // Exibe os extratos das 3 contas em separado.
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        System.out.println(">>> O investimento rendeu 5%a.m por 5 meses.\n");
        ci.imprimirExtrato();

        // Transfere o saldo da CI para CC
        System.out.printf(">>> Transfere todo saldo da CI p/ CC\n");
        ci.transferir(ci.getSaldo(), cc);

        // Exibe saldo CI
        ci.imprimirExtrato();

        // Exibe saldo CC
        cc.imprimirExtrato();

        // Exibe o extrato consolidado das 3 contas.
        extrato.imprimirExtrato();
        System.out.println(String.format("R$ %.2f\n", cc.saldo + cp.saldo + ci.saldo));

        // E a CP ? Adivinha se o dinheiro rendeu alguma coisa !!!
        // Exibir o extrato da conta poupanca
        System.out.println(">>> E a poupanca? Rende nada mesmo!!!");
        cp.imprimirExtrato();

        // Acabou esse exemplo, agora vou adicionar outro cliente
        System.out.println("###############################################################");

        // Cria o cliente
        System.out.println(">>> Cria Cliente");
        Cliente antonio = new Cliente();
        antonio.setNome("Antonio Mello");
        // Cria as 3 contas para Antonio Mello e exibe o extrato consolidado
        System.out.println(">>> cria as contas para cliente");
        Conta cc2 = new ContaCorrente(antonio);
        Conta cp2 = new ContaPoupanca(antonio);
        Conta ci2 = new ContaInvestimento(antonio);
        ExtratoConsolidado extrato2 = new ExtratoConsolidado(antonio);

        // Deposita 1000 na conta corrente (cc2)
        System.out.println(">>> Deposita R$ 1000,00 CC2");
        cc2.depositar(1000);

        // Transfere 1000 para conta poupanca (cp2)
        System.out.println(">>> Transfere R$ 1000,00 p/ CP2");
        cc2.transferir(1000, cp2);

        // Exibe os extratos das 3 contas em separado.
        System.out.println(">>> Exibe o extrato de cada conta separado.");
        cc2.imprimirExtrato();
        cp2.imprimirExtrato();
        ci2.imprimirExtrato();

        System.out.println(">>> Exibe extrato consolidado");
        extrato2.imprimirExtrato();
        System.out.println(String.format("R$ %.2f\n", cc2.saldo + cp2.saldo + ci2.saldo));

        System.out.println(banco.getNome() + banco.getContas());
    }
}
