package Genericas;

public class UsaEnum {

    public static void main(String[] args) {
        NiveisAcesso nivel =  NiveisAcesso.EDITOR;

        System.out.println("Nivel de acesso selcionado: "+nivel);

        switch (nivel){
            case ADMIN:
                System.out.println("Acessto total concedido");
                break;
            case EDITOR:
                System.out.println("Acessto limitado: pode editar conteúdo");
                break;
            case VISITANTE:
                System.out.println("Acessto somente a leitura");
                break;

        }
            System.out.println("\nTodos os niveis de acesso disponivel");
        for(NiveisAcesso n : NiveisAcesso
                .values()){
            System.out.println("- "+n);
        }

    }
}
