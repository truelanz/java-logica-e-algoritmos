package aula.logicaAlgoritmos.estruturaCondicional;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String dia;
        int numeroDia = sc.nextInt();

    switch(numeroDia){
        case 1:
            dia = "domingo";
        break;
        case 2:
            dia = "Segunda";
        break;
        case 3:
            dia = "terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sábado";
            break;
        default:
            dia = "Numero do dia inválido";
        }

        System.out.println(dia);
        
        sc.close();
    }
}
