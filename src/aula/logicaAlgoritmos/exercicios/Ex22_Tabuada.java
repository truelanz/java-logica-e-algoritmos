package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 *22º Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).
*/
public class Ex22_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int multiplicação;

        for(int i = 1; i <= 10; i++){
            multiplicação = numero * i;
            System.out.println(i + " X " + numero + " = " + multiplicação);
        }

        sc.close();
    }
    
}
