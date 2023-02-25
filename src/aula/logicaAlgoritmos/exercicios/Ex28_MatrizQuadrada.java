package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * 28º Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
 * de valores negativos da matriz.
 */
public class Ex28_MatrizQuadrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] matriz = new int[N][N];

        int numerosNegativos = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matriz[i][j] = sc.nextInt();
                //ARMAZENANDO NÚMEROS NEGATIVOS EM UMA VARIÁVEL.
                if(matriz[i][j] < 0){
                    numerosNegativos++;
                }
            }
        }
        //MOSTRANDO A DIAGONAL PRINCIPAL...
        System.out.println("DIAGONAL PRINCIPAL:");
        for(int count = 0; count < N; count++){
            System.out.print(matriz[count][count] + " ");
        }
        
        System.out.println("\nQUANTIDADE DE NAGATIVOS = " + numerosNegativos);

        sc.close();    
    }
}
