package Genericas;

public class TesteCaixa {

    public static void main(String[] args) {

        Caixa<String> caixa1 = new Caixa<>();

        caixa1.guardar("Olá Mundo");
        System.out.println("Conteudo da caixa: "+caixa1.pegar());
        caixa1.setConteudo("Testando 123");
        System.out.println("Conteudo agora é: "+caixa1.getConteudo());

        Caixa<Integer> caixa2 = new Caixa<>();

        caixa2.setConteudo(123456);
        System.out.println("Conteudo da caixa2: "+caixa2.pegar());

    }
}
