package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 *34º Fazer um programa para ler duas matrizes de números inteiros A e B, 
 * contendo de M linhas e N colunas cada. Depois, gerar uma terceira
 * matriz C onde cada elemento desta é a soma dos elementos correspondentes
 * das matrizes originais. Imprimir na tela a matriz gerada.
 * 
Entrada:
A entrada contém os valores de M e N, depois os valores da primeira matriz A, depois os valores da segunda matriz B,
conforme exemplo.
Saída:
A saída contém os valores da matriz gerada C, conforme exemplo.
 */
public class Ex34_SomaMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhaM = sc.nextInt();
        int colunaN = sc.nextInt();

        int[][] matrizA = new int[linhaM][colunaN];
        int[][] matrizB = new int[linhaM][colunaN];
        int[][] matrizC = new int[linhaM][colunaN];

        //Matriz A
        for(int i = 0; i < linhaM; i++){
            for(int j = 0; j < colunaN; j++){
                matrizA[i][j] = sc.nextInt();
            }
        }
        //Matriz B
        for(int i = 0; i < linhaM; i++){
            for(int j = 0; j < colunaN; j++){
                matrizB[i][j] = sc.nextInt();
            }
        }
        
        //Somando valor das matrizes...
        for(int i = 0; i < linhaM; i++){
            for(int j = 0; j < colunaN; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        //Imprimir matriz C na tela...
        for(int i = 0; i < linhaM; i++){
            for (int j = 0; j < colunaN; j++){
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
