package aula.logicaAlgoritmos.exercicios;
/*
 * 32º Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o 
 * maior elemento de cada linha. Suponha não haver
   empates.

Entrada:
A entrada contém o número N, depois os dados da matriz.
Saída:
A saída contém os números representando o maior elemento de cada linha da matriz.
 */
import java.util.Scanner;

public class Ex32_MatrizMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mN = sc.nextInt();
        int[][] matriz = new int[mN][mN];
        int maiorElemento = 0;

        for(int i = 0; i < mN; i++){
            for(int j = 0; j <mN; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //Ver qual o maior número de cada linha...
        for(int i = 0; i < mN; i++){
            maiorElemento = 0;
            for(int j = 0; j <mN; j++){
                maiorElemento = Math.max(maiorElemento, matriz[i][j]);
            }
            System.out.println(maiorElemento);
        }

        sc.close();
    }
}
