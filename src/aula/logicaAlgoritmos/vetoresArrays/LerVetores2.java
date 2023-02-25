package aula.logicaAlgoritmos.vetoresArrays;

import java.util.Scanner;

/*
 * Ler e armazenar números inteiros em vetores, e mostrar somente os numeros negativos;
 */
public class LerVetores2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int numeroDeVetores = sc.nextInt();
        int[] vetor = new int[numeroDeVetores];

        for(int i = 0; i < numeroDeVetores; i++){
            vetor[i] = sc.nextInt();
        }
        System.out.println("---");
        for(int i = 0; i < numeroDeVetores; i++){
            if(vetor[i] < 0){
                System.out.printf("%d%n", vetor[i]);
            }
        }
        
        sc.close();
    }
}
