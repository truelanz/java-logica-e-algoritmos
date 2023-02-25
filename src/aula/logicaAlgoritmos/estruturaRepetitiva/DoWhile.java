package aula.logicaAlgoritmos.estruturaRepetitiva;

import java.util.Scanner;

/*
 * Exercícios em do While - faça ... enquanto;
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resposta;

        do{
            System.out.println("Temperatura em Celcius: ");
            double celcius = sc.nextDouble();
            double fahrenheit = 9 * celcius / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.println("deseja repetir?");
            resposta = sc.next().charAt(0);
        }while(resposta != 'n');

        sc.close();
    }
    
}
