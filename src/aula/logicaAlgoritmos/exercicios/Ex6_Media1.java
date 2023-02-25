package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * Leia 2 valores de ponto flutuante de dupla precisão A e B,
 * que correspondem a 2 notas de um aluno. A seguir, calcule
 * a média do aluno, sabendo que a nota A tem peso 3.5 e a
 * nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
 * Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
 * O arquivo de entrada contém 2 valores com uma casa decimal cada um.
 */

public class Ex6_Media1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pesoNotaA = 3.5, pesoNotaB = 7.5;
        double somaPesoNota = pesoNotaA + pesoNotaB;

        System.out.println("Nota: ");
        double a = sc.nextDouble();
        System.out.println("Nota: ");
        double b = sc.nextDouble();

        double media = ((a * pesoNotaA) + (b * pesoNotaB)) / somaPesoNota;
        System.out.printf("Media = %.5f", media);

        sc.close();
    }
}
