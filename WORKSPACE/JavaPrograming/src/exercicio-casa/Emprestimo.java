import java.util.Scanner;

public class Emprestimo extends OperacaoBancaria {

    public Emprestimo(double saldoAtual, Scanner scanner) {
        super(saldoAtual, scanner);
    }

    @Override
    public void executar() {
        System.out.println("\n--- Solicitação de Empréstimo ---");
        System.out.print("Informe o seu salário atual: R$ ");
        double salario = scanner.nextDouble();

        if (salario <= 0) {
            System.out.println("Salário inválido. O salário deve ser maior que zero.");
            return;
        }

        double limiteEmprestimo = 3.0 * salario;
        int numeroParcelas = 12;
        double taxaJurosMensal = 0.02;
        double percentualMaximoParcela = 0.30;

        System.out.printf("Você pode solicitar até R$ %.2f de empréstimo (3x seu salário).%n", limiteEmprestimo);

        double valorEmprestimoDesejado;
        boolean valorValido = false;

        do {
            System.out.print("Informe o valor do empréstimo desejado: R$ ");
            valorEmprestimoDesejado = scanner.nextDouble();

            if (valorEmprestimoDesejado <= 0 || valorEmprestimoDesejado > limiteEmprestimo) {
                System.out.printf("Valor inválido. O empréstimo deve ser maior que zero e não pode ultrapassar R$ %.2f.%n", limiteEmprestimo);
                continue;
            }

            double fator = Math.pow(1 + taxaJurosMensal, numeroParcelas);
            double parcelaMensal = valorEmprestimoDesejado * (taxaJurosMensal * fator) / (fator - 1);

            double limiteParcelaSalario = salario * percentualMaximoParcela;

            if (parcelaMensal > limiteParcelaSalario) {
                System.out.printf("A parcela mensal de R$ %.2f ultrapassa 30%% do seu salário (R$ %.2f).%n", parcelaMensal, limiteParcelaSalario);
                System.out.println("Por favor, digite um novo valor menor para o empréstimo.");
            } else {
                System.out.printf("Valor do empréstimo: R$ %.2f%n", valorEmprestimoDesejado);
                System.out.printf("Parcelas mensais: %d vezes de R$ %.2f%n", numeroParcelas, parcelaMensal);
                System.out.println("Empréstimo aprovado! O valor será creditado em sua conta.");
                saldo += valorEmprestimoDesejado; // Atualiza o saldo diretamente (porque herdou)
                valorValido = true;

                if (parcelaMensal < limiteParcelaSalario * 0.8) {
                    double valorEmprestimoMaiorSugerido = (limiteParcelaSalario * (fator - 1)) / (taxaJurosMensal * fator);
                    if (valorEmprestimoMaiorSugerido <= limiteEmprestimo) {
                        System.out.printf("Você pode solicitar um empréstimo maior, de até R$ %.2f, mantendo a parcela dentro do limite. Deseja ajustar o valor? (s/n)%n", valorEmprestimoMaiorSugerido);
                    }
                }
            }
        } while (!valorValido);
    }
}