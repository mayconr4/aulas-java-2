package Collections;

import java.util.HashMap;

public class MapaExemplo {

    public static void main(String[] args) {
        HashMap<String,Integer> estoque = new HashMap<>();

        estoque.put("Maçã",10);
        estoque.put("Pera",20);
        estoque.put("Jabuticaba",12);
        estoque.put("Abacate",25);
        estoque.put("Laranja",100);
        estoque.put("Limão",50);
        estoque.put("Pitaya",30);
        estoque.put("Pitanga",200);

        System.out.println("Qtd pera: "+estoque.get("Pera"));



    }
}
