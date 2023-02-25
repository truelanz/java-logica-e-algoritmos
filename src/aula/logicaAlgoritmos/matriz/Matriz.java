package aula.logicaAlgoritmos.matriz;

import java.util.Scanner;

/*
 * Fazer um programa para ler dois números inteiros positivos M e N, depois ler
 * uma matriz de M linhas e N colunas números inteiros. Em seguida, mostrar na
 * tela a matriz lida conforme exemplo.
 */
public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linhaM = sc.nextInt();
        int colunaN = sc.nextInt();

        int[][] matrizMN = new int [linhaM][colunaN];

        /* Padrão: linhas LETRA "i", colunas LETRA "j".
        Para armazenar e ler uma matriz é necessário fazer um "for (com count j) - coluna"
         dentro do "for (com count i) - linha... */
        for(int i = 0; i < linhaM; i++){
            for (int j = 0; j < colunaN; j++){
                matrizMN[i][j] = sc.nextInt();
            }
        }

        /* Para ler a matriz é só repetir o for de armazenamento removendo o "sc.next...();"
        adcionando uma quebre de linha embaixo do corpo for... */
        for(int i = 0; i < linhaM; i++){
            for (int j = 0; j < colunaN; j++){
                System.out.print(matrizMN[i][j] + " ");
            }
            System.out.println();
        }
         

        sc.close();




        
    }
}
