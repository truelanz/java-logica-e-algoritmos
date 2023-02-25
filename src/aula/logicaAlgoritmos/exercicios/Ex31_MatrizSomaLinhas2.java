package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * 31º  Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois, 
 * mostrar na tela a soma dos elementos de cada linha da matriz.
 * 
Entrada:
A entrada contém o número N, depois os dados da matriz.
Saída:
A saída contém os números representando a soma dos elementos de cada linha da matriz.
 */
public class Ex31_MatrizSomaLinhas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho quadrado da matriz: ");
        int mN = sc.nextInt();

        int[][] matriz = new int[mN][mN];
        int soma = 0;

        for(int i = 0; i < mN; i++){
            for(int j = 0; j < mN; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //Mostrar soma de cada linha da matriz...
        for(int i = 0; i < mN; i++){
            //Quando terminhar a soma de uma linha, redefinir valor de soma por zero.
            soma = 0; 
            for(int j = 0; j < mN; j++){
                soma += matriz[i][j];
            }
            //Mostrar soma acumulada na variável quando terminhar o segundo siclo for...
            System.out.println(soma); 
        }



        sc.close();
    }
    
}
