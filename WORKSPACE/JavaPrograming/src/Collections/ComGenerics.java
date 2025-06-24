package Collections;

import java.util.ArrayList;

public class ComGenerics {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");

        for (String nome:nomes){
            System.out.println(nome.toUpperCase());
        }

    }
}
