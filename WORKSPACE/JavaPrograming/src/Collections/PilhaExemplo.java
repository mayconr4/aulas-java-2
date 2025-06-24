package Collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;


public class PilhaExemplo {
    public static void main(String[] args) {
   Deque<String> pilha = new ArrayDeque<>();

   pilha.push("a");
   pilha.push("b");
   pilha.push("c");

   while(!pilha.isEmpty()){
       System.out.println(pilha.pop());
   }


    }

}
