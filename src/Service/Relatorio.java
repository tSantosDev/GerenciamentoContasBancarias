package Service;

import domain.Conta;

public class Relatorio {
    public void imprimeRelatorio(Conta conta) {
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo da conta: " + conta.getSaldo());
    }
}
