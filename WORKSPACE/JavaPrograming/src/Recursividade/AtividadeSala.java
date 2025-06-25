package Recursividade;

import java.util.Scanner;

public class AtividadeSala {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int base;
    int expoente;

    System.out.println("Digite a base");
    base = ler.nextInt();

    System.out.println("Digite o expoente");
    expoente = ler.nextInt();

    System.out.println( "+base+"+"x"+"+expoente+"+potencia(base,expoente));



    }

    public static int potencia(int base, int expoente){
        if(expoente == 0) return  1;
        return base*potencia(base, expoente-1);

    }
}
