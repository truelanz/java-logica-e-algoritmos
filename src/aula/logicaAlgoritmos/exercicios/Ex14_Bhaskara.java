package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * 14º Leia 3 valores de ponto flutuante e efetue o cálculo das raízes
 * da equação de Bhaskara. Se não for possível calcular as raízes,
 * mostre a mensagem correspondente “Impossivel calcular”, caso haja
 * uma divisão por 0 ou raiz de numero negativo.

Entrada
 * Leia três valores de ponto flutuante A, B e C.
 */

public class Ex14_Bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2.0) - 4.0 * a * c;

        if(a == 0 || delta < 0)
            System.out.println("IMPOSSÍVEL CALCULAR");
        else {
            double r1 = ((-b + Math.sqrt(delta))) / (2.0 * a);
            double r2 = ((-b - Math.sqrt(delta))) / (2.0 * a);
        
        System.out.printf("R1 = %.5f%n", r1);
        System.out.printf("R2 = %.5f", r2);
        }
        
        sc.close();
    }
}
