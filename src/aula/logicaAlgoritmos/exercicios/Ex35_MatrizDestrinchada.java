package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 *35º Ler uma matriz quadrada de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
 * 
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.

Entrada:
A entrada contém o número inteiro N, seguido dos valores da matriz com uma casa decimal cada, seguido do índice de
uma linha, seguido do índice de uma coluna, conforma exemplo.
Saída:
A saída contém os valores de saída de cada ação, com uma casa decimal, na ordem em que foram apresentadas no
enunciado, conforme exemplo.
 */
public class Ex35_MatrizDestrinchada {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int mN = sc.nextInt();
        double[][] matriz = new double[mN][mN];
        double soma = 0.0;
        
        for(int i = 0; i < mN; i++){
            for(int j = 0; j < mN; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        //SOMAR SOMENTE NÚMEROS POSITIVOS;
        for(int i = 0; i < mN; i++){
            for(int j = 0; j < mN; j++){
                if(matriz[i][j] > 0){
                    soma += matriz[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f", soma);

        System.out.println(" ");
        //MOSTRAR LINHA ESPECIFICA;
        System.out.println("\nEscolha uma linha de 0 a " + (mN-1) + " para ser mostrada: ");
        int linha = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");

		for (int j = 0; j < mN; j++){
			System.out.printf("%.1f | ", matriz[linha][j]);
		}
		
        System.out.println(" ");
        //MOSTRAR COLUNA ESPECIFICA;
        System.out.println("\nEscolha uma coluna de 0 a " + (mN-1) + " para ser mostrada: ");
        int coluna = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for(int i = 0; i < mN; i++){
                System.out.printf("%.1f | ", matriz[i][coluna]);
        }

        //MOSTRAR DIAGONAL PRINCIPAL:
        System.out.print("\nDIAGONAL PRINCIPAL: ");
        for(int count = 0; count < mN; count++){
            System.out.printf("%.1f ", matriz[count][count]);
        }

        //ALTERANDO MATRIZ, ELEVANDO AO QUADRADO NÚMEROS NEGATIVOS E MOSTRANDO NA TELA:
        for(int i = 0; i < mN; i++){
            for(int j = 0; j < mN; j++){
                if(matriz[i][j] < 0){
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
        }
        System.out.println("\nMATRIZ ALTERADA: ");
        for(int i = 0; i < mN; i++){
            for(int j = 0; j < mN; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    sc.close();
    }
    
}
