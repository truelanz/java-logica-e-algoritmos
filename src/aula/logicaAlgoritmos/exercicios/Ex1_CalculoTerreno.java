package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 *1º Fazer um programa para ler as medidas da largura e comprimento de um terreno
 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
 * terreno, bem como o valor do preço do terreno, ambos com duas casas decimais.
 */

public class Ex1_CalculoTerreno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a largura do terreno: ");
        double larguraTerreno = sc.nextDouble();

        System.out.println("\nDigite o comprimento do terrono: ");
        double comprimentoTerrno = sc.nextDouble();

        System.out.println("\nDigite o valor do metro quadrado: ");
        double valorMetroTerreno = sc.nextDouble();

        double areaTerreno = larguraTerreno * comprimentoTerrno;
        Double totalValorTerreno = areaTerreno * valorMetroTerreno;

        System.out.printf("O tamanho do terreno é: %.2f m2.", areaTerreno);
        System.out.printf("%nCom o valor de: %.2f Reais.", totalValorTerreno);

        sc.close();

    }
}