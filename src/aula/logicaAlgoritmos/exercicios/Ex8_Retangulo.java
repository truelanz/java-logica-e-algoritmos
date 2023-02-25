package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler as medidas da base e altura de um 
 * retângulo. Em seguida, mostrar o valor da área, perímetro e
 * diagonal deste retângulo, com quatro casas decimais.
 */
public class Ex8_Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Comprimento: ");
        double comprimentoRetangulo = sc.nextDouble();
        System.out.println("Comprimento: ");
        double alturaRetangulo = sc.nextDouble();

        double area = comprimentoRetangulo * alturaRetangulo;
        double perimetro = 2.0 * (alturaRetangulo + comprimentoRetangulo);
        double diagonal = Math.sqrt(Math.pow(comprimentoRetangulo, 2.0) + Math.pow(alturaRetangulo, 2.0));

        System.out.printf("Area = %.4f", area);
        System.out.printf("%nPerimetro = %.4f", perimetro);
        System.out.printf("%nDiagonal = %.4f", diagonal);

        sc.close();
    }
}
