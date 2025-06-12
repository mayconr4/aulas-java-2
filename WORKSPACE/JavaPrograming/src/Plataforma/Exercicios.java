package Plataforma;

import java.util.Scanner;

public class Exercicios {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String str1 = "Hello", str2 = "Maycon", str3;

        str3 = "You are " + str2;

        System.out.println("Welcome: " + str3);

        System.out.println("Length: " + str1.length());

        System.out.println("Sub: " + str3.substring(0, 5));

        System.out.println("Upper: " + str2.toUpperCase());

        System.out.println("Digite qualquer palavra: ");
        String palavra = ler.nextLine();

        System.out.println("Digite qualquer palavra: ");
        String palavra2 = ler.nextLine();
        //ler.close(); boa prática
        // compara as String e retorna veradeiro ou falso
        System.out.println(palavra.equals(palavra2));
        System.out.println(palavra2.compareTo(palavra));

        //
        String a;
        int b;
        double c;
        float d ;
        short e;
        long f ;
        boolean g;
        byte h;

        /*
        System.out.println("Digite uma string: ");
        a =ler.nextLine();

        System.out.println("Digite um inteiro: ");
        b= ler.nextInt();

        System.out.println("Digite um double: ");
        c= ler.nextDouble();

        System.out.println("Digite Um float: ");
        d = ler.nextFloat();

        System.out.println("Digite um short: ");
        e = ler.nextShort();

        System.out.println("Digite um long: ");
        f = ler.nextLong();

        System.out.println("Digite um boolean: ");
        g = ler.hasNextLong();

        System.out.println("Digite um byte: ");
        h =ler.nextByte();
        */


       /* do{
            System.out.println("digite");
            a=ler.nextLine();

            if (a.equals("não")){
                break;
            }

        }while (a.equals("sim"));*/


            System.out.println("digite alguns numeros");
            a=ler.nextLine();
        boolean loop = true;
        do{

            if (a.equals("0")){

                loop = false;

            }

        }while (!a.equals("0"));
        System.out.println(a+" fim do loop");

        String myBouquet[] = new String[6];

        int[] numbers  = {4,2,5,7} ;





    }
}









