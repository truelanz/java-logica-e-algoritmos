package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

public class Ex11_DistanciaEntrePontos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, x2, y1, y2;
        System.out.println("x1: ");
        x1 = sc.nextDouble();
        System.out.println("y1: ");
        x2 = sc.nextDouble();
        System.out.println("x2: ");
        y1 = sc.nextDouble();
        System.out.println("y2: ");
        y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));

        System.out.printf("%.4f", distancia);

        sc.close();
    }
}
