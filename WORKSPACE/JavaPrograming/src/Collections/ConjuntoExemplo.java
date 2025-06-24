package Collections;

import java.util.HashSet;

public class ConjuntoExemplo {

    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        HashSet<Integer> numeros = new HashSet<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Huginho");
        nomes.add("Zezinho");
        nomes.add("Luizinho");
        nomes.add("João");
        nomes.add("Maria"); //não repite os mesmos digitos


        numeros.add(6);
        numeros.add(4);
        numeros.add(4);//não repete

        System.out.println(nomes);
        System.out.println(numeros);

    }

}
