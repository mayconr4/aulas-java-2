package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarStrings {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Vanessa");
        nomes.add("Ricardo");
        nomes.add("Juliana");
        nomes.add("Marcos");
        nomes.add("Beatriz");
        nomes.add("Felipe");
        nomes.add("Amanda");
        nomes.add("Eduardo");
        nomes.add("Larissa");
        nomes.add("Rafael");

        Collections.sort(nomes);
        System.out.println(nomes);



    }
}
