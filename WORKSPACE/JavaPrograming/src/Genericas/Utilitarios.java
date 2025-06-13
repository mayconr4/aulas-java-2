package Genericas;

public class Utilitarios {


    public static void main(String[] args) {
        System.out.println(comparar(10,10));
        System.out.println(comparar("abc","cde"));
    }

    public static<T> boolean comparar(T a, T b){
        return  a.equals(b);
    }


}
