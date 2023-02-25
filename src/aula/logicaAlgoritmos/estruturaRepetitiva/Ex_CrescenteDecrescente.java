package aula.logicaAlgoritmos.estruturaRepetitiva;

import java.util.Scanner;

public class Ex_CrescenteDecrescente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        while(numero1 != numero2){
            if(numero1 < numero2)
            System.out.println("Crescente!");
            else
            System.out.println("Decrescente!");
            numero1 = sc.nextInt();
            numero2 = sc.nextInt();
        }
        System.out.printf("%n%d e %d são números iguals.", numero1, numero2);

        sc.close();
    } 
}
