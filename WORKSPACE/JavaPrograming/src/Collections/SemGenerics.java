package Collections;

import java.util.ArrayList;

public class SemGenerics {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        lista.add("Texto");
        lista.add(123);


        for(Object item:lista){
            System.out.println(item);
        }

    }
}
