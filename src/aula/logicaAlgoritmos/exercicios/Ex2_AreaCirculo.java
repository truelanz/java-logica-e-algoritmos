package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 * 2º A fórmula para calcular a área de uma circunferência é:
 *  area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e
 * multiplicando por π.
 */
public class Ex2_AreaCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n = 3.14159;
        double area;
        double raio;

        System.out.println("Raio: ");
        raio = sc.nextDouble();

        raio = Math.pow(raio, 2.0);
        area = raio * n;

        System.out.printf("A=%.4f", area);

        sc.close();

    }
}
