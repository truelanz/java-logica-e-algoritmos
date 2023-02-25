package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
de M linhas e N colunas contendo números double. Gerar um vetor de modo que cada
elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
Mostrar o vetor gerado.
 */
public class Ex29_MatrizSomaLinha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int linhaM = sc.nextInt();
        int colunaN = sc.nextInt();
        
        double[][] matriz = new double[linhaM][colunaN];

        //LER E ARMAZENAR NÚMEROS DA MATRIZ
        for(int i = 0; i < linhaM; i++){
            for(int j = 0; j < colunaN; j++){
                matriz[i][j] = sc.nextDouble();
        }
    }

        //SOMAR NÚMEROS DAS LINHAS M DA MATRIZ
        double[] matrizLinha = new double[linhaM];
        for(int i = 0; i < linhaM; i++){
            double soma = 0.0;
            for(int j = 0; j < colunaN; j++){
                soma += matriz[i][j];
            }
            matrizLinha[i] = soma;
        }
        //MOSTRAR SOMA DAS LINHAS
        for(int i = 0; i < linhaM; i++) {
            System.out.printf("%.1f%n", matrizLinha[i]);
        }
    
    sc.close();
    }
}
