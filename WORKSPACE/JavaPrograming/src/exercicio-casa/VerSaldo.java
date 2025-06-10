import java.util.Scanner;

public class VerSaldo extends OperacaoBancaria {

    public VerSaldo(double saldoAtual, Scanner scanner) {
        super(saldoAtual, scanner);
    }

    @Override
    public void executar() {
        System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
    }
}