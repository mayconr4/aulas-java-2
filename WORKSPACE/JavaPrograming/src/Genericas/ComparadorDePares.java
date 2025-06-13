package Genericas;



public class ComparadorDePares {
    public static<K,V> boolean compararChaves(Par<K,V> p1,Par<K,V> p2){
        return  p1.getChave().equals(p2.getValor());
    }

}
