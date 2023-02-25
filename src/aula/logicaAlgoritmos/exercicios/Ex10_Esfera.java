package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que calcule e mostre o volume de uma esfera sendo
 * fornecido o valor de seu raio (R). A fórmula para calcular o
 * volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Entrada
 * O arquivo de entrada contém um valor de ponto flutuante (dupla precisão),
 * correspondente ao raio da esfera.
 */
public class Ex10_Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Raio: ");
        double raio = sc.nextDouble();
        double pi = 3.14159;

        double volume = 4.0 * pi * Math.pow(raio, 3) / 3.0;
        System.out.printf("Volume = %.3f", volume);

        sc.close();
    }
}
