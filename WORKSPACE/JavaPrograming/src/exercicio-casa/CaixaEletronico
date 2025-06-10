import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        // A ContaBase gerencia o saldo e o scanner para todas as operações
        ContaBase conta = new ContaBase(1000.00); // Saldo inicial de R$ 1000,00

        int opcao;
        do {
            System.out.println("\n--- Menu do Caixa Eletrônico ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver Saldo");
            System.out.println("4. Solicitar Empréstimo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = conta.getScanner().nextInt(); // Usa o scanner da ContaBase

            // As operações precisam ser recriadas ou ter seus construtores chamados
            // para que a base de saldo seja atualizada
            switch (opcao) {
                case 1:
                    Deposito deposito = new Deposito(conta.getSaldo(), conta.getScanner());
                    deposito.executar();
                    conta.setSaldo(deposito.getSaldo()); // Atualiza o saldo da conta base
                    break;
                case 2:
                    Saque saque = new Saque(conta.getSaldo(), conta.getScanner());
                    saque.executar();
                    conta.setSaldo(saque.getSaldo()); // Atualiza o saldo da conta base
                    break;
                case 3:
                    VerSaldo verSaldo = new VerSaldo(conta.getSaldo(), conta.getScanner());
                    verSaldo.executar();
                    // Não precisa atualizar saldo pois ver saldo não altera
                    break;
                case 4:
                    Emprestimo emprestimo = new Emprestimo(conta.getSaldo(), conta.getScanner());
                    emprestimo.executar();
                    conta.setSaldo(emprestimo.getSaldo()); // Atualiza o saldo da conta base
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        conta.getScanner().close(); // Fechar o scanner da conta base
    }
}