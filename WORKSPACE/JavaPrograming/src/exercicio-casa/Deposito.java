import java.util.Scanner;

public class Deposito extends OperacaoBancaria {

    public Deposito(double saldoAtual, Scanner scanner) {
        super(saldoAtual, scanner);
    }

    @Override
    public void executar() {
        System.out.print("Informe o valor a depositar: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f%n", valor, saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }
}