import java.util.Scanner;

public class Saque extends OperacaoBancaria {

    public Saque(double saldoAtual, Scanner scanner) {
        super(saldoAtual, scanner);
    }

    @Override
    public void executar() {
        System.out.print("Informe o valor a sacar: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.printf("Saque de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f%n", valor, saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }
}