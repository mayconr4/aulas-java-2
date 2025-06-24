package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Produto implements Comparable<Produto>{

   String nome;
   double preco;

   Produto(String nome, double preco){
       this.nome = nome;
       this.preco = preco;
   }

    /*public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<Produto>();

        lista.add("TV",2500);
        lista.add("Celular",1800);
        lista.add("Notebook",3200);
        lista.add("Geladeira",5000);

        Collections.



    }*/

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco , outro.preco);
    }

    public String toString(){
       return nome+"-"+preco;
    }


}
