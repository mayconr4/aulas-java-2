package Genericas;

public class TesteEnum {

    public static void main(String[] args) {
        DiaSemana hoje = DiaSemana.QUARTA;



        switch (hoje){
            case SEGUNDA :
                System.out.println("Começando a semana !!");
                break;
            case SEXTA:
                System.out.println("Ultimo dia Util!!");
                break;
            default:
                    System.out.println("Dia comun!!");
            }
        }

    }

