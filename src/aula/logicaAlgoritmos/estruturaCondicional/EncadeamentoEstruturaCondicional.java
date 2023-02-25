package aula.logicaAlgoritmos.estruturaCondicional;

import java.util.Scanner;

public class EncadeamentoEstruturaCondicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Que horas do dia são? ");
        int hora = sc.nextInt();

        if(hora <= 11 && hora >= 4){
            System.out.println("Bom dia!");
        }else if(hora >= 12 && hora <= 18){
            System.out.println("Boa Tarde!");
        }else if(hora <= 24 && hora >= 19 || hora <= 3){
            System.out.println("Boa Noite!");
        }else System.out.println("Digite um horário até 24!");

        sc.close();
    }
    
}
 