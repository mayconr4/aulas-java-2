package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class FIlaExemplo {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();


        fila.offer("Cliente 1");
        fila.offer("Cliente 2");

        System.out.println(fila.poll());
        System.out.println(fila.poll());


    }

}
