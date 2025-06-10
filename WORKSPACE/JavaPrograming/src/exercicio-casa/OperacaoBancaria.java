import java.util.Scanner;

public abstract class OperacaoBancaria extends ContaBase {

    public OperacaoBancaria(double saldoAtual, Scanner scanner) {
        super(saldoAtual); // Chama o construtor da superclasse ContaBase
        this.scanner = scanner; // Assegura que o scanner esteja disponível
    }

    // Método abstrato que cada operação deve implementar
    public abstract void executar();
}