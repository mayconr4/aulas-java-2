package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class FilaExemplo01 {

    public static void main(String[] args) {
        Random rand =  new Random();
        Queue<Integer> numero = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite 10 numero inteiros");


        for (int i = 0; i <10 ; i++) {

             int numeroDigitado = scanner.nextInt();
            numero.offer(numeroDigitado);
        }

        System.out.println("\nConteudo da fila:");
        System.out.println(numero);

        System.out.println("\nRemovendo e exibindo os elementos da fila: ");
        while (!numero.isEmpty()){
            System.out.println(numero.poll()+",");
        }

        System.out.println("Fila vazia: "+numero.poll());
        scanner.close();



        /*for (int i = 0; i <20 ; i++) {

            numero.offer(rand.nextInt());
            System.out.println(numero);

        }
        for (int i = 0; i <numero.element() ; i++) {

            System.out.println(numero.poll());


        }*/


    }

}
