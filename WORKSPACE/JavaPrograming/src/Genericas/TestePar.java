package Genericas;

public class TestePar {

    public static void main(String[] args) {
        Par<Integer,String> par1 = new Par<>(1, "um");
        Par<Integer,String> par2 = new Par<>(1, "outro");

        System.out.println("par 1: "+par1);
        System.out.println("par 2: "+par2);

        boolean chavesIguais = ComparadorDePares.compararChaves(par1,par2);

        System.out.println("As chaves são iguais? "+chavesIguais);
    }
}
