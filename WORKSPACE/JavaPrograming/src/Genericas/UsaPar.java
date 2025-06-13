package Genericas;

public class UsaPar {
    public static void main(String[] args) {
        //Par com intger e String
    Par<Integer, String> par1 = new Par<>(1,"Um");
    System.out.println("Par 1: "+par1);

    //Par com string e String
    Par<String, String> par2 = new Par<>("chave","Um");
    System.out.println("Par 2: "+par2);

    //Par com String e Double

    Par<String, Double> par3 = new Par<>("Pi",3.14159);
    System.out.println("Par 3: "+par3);

    Par<Boolean, Character> par4 = new Par<>(true,'A');
    System.out.println("Par 4: "+par4);



    }


}



