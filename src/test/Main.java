package test;

import Service.Relatorio;
import domain.Conta;
import exception.LimiteSaqueException;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("345210");
        Relatorio relatorio = new Relatorio();

        conta.setSaldo(5000.00);

        try {
            conta.deposito(500);
            conta.saque(100);
        }catch (LimiteSaqueException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        relatorio.imprimeRelatorio(conta);
    }
}
