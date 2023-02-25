package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 *33º Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos 
 * acima da diagonal principal.
 * 
Entrada:
A entrada contém o valor N, depois os dados da matriz.
Saída:
A saída contém a soma dos elementos da diagonal principal
 */
public class Ex33_NumerosDiagonalAcima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mN = sc.nextInt();
        int[][] matriz = new int[mN][mN];
        int soma = 0;

        for(int i = 0; i < mN; i++){
            for(int j = 0; j < mN; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //MOSTRAR SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL...
        for(int i = 0; i < mN; i++){       
            for(int j = i + 1; j < mN; j++){
                soma += matriz[i][j];
            }
        }
        System.out.println(soma);
            
        sc.close();
    }
    
}
