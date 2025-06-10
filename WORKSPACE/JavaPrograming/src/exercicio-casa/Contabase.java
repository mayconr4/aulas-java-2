import java.util.Scanner;

public class ContaBase {
    protected double saldo;
    protected Scanner scanner;

    public ContaBase(double saldoInicial) {
        this.saldo = saldoInicial;
        this.scanner = new Scanner(System.in);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Scanner getScanner() {
        return scanner;
    }
}