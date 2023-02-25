package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * 25º Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.
 */
public class Ex25_Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
    
}
