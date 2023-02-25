package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 * 15º Programa para ler três números inteiros, e mostrar qual
 * é o menor entre os três números lidos. Caso empate, 
 * mostrar apenas uma vêz.
 */
public class Ex15_MenorNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2, numero3;
        
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();

        if(numero1 < numero2 && numero1 < numero3)
            System.out.println("MENOR = " + numero1);
        else if(numero2 < numero3)
            System.out.println("MENOR = " + numero2);
        else
            System.out.println("MENOR = " + numero3);
        
        sc.close();
}}
