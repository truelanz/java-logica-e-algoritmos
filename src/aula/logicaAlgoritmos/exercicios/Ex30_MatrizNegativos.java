package aula.logicaAlgoritmos.exercicios;
/*
 * 30º Ler dois números M e N, e depois ler uma matriz MxN de números inteiros, conforme exemplo. 
 * Em seguida, mostrar na tela somente os números negativos da matriz.
 * 
Entrada:
A entrada contém os números M e N na mesma linha, depois os dados da matriz.

 Saída:
A saída contém uma mensagem e depois os números negativos da matriz, conforme exemplo.
 */

import java.util.Scanner;

public class Ex30_MatrizNegativos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho da linha 'M' da matriz");
        int linhaM = sc.nextInt();
        System.out.println("Tamanho da coluna 'N' da matriz");
        int colunaN = sc.nextInt();

        int[][] matriz = new int[linhaM][colunaN]; 

       for(int i = 0; i < linhaM; i++){
            for(int j = 0; j < colunaN; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //MOSTRAR NÚMEROS NEGATIVOS DA MATRIZ
        System.out.println("VALORES NEGATIVOS:");
        for(int i = 0; i < linhaM; i++){
            for(int j = 0; j < colunaN; j++){
                if(matriz[i][j] < 0){    
                    System.out.printf("%d%n", matriz[i][j]);
                }
            }
        }

        sc.close();
    }
}
