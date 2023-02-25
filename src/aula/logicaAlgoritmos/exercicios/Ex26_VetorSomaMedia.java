package aula.logicaAlgoritmos.exercicios;
/*
 * 26º Ler N números reais e armazenar em um vetor.
 * 
 * Em seguida imprima todos os elementos do vetor.
 * 
 * - Mostrar na tela a soma e a média dos elementos do vetor.
 */

import java.util.Scanner;

public class Ex26_VetorSomaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = sc.nextInt();

        double[] vetor = new double[tamanhoVetor];
        double soma = 0.0;

        for(int i = 0; i < tamanhoVetor; i++){
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        //imprimindo vetor por vetor, um por um...
        for(int i = 0; i < tamanhoVetor; i++){
            System.out.printf("%.1f ", vetor[i]);
        }
        double media = soma / vetor.length; //ou --> / tamanhovetor;
        System.out.println("\n" + soma);
        System.out.println(media);
        

        sc.close();
    }
    
}
