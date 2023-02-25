package aula.logicaAlgoritmos.vetoresArrays;

import java.util.Scanner;

public class LerVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroVetores = sc.nextInt();

        double[] vetor = new double[numeroVetores];;

        for(int i = 0; i < numeroVetores; i++){
            vetor[i] = sc.nextDouble();
        }
        for(int i = 0; i < numeroVetores; i++){
            System.out.printf("%.2f%n", vetor[i]);
        }
        //Maneira "errada" de resolver:

       /*  double posicao0 = sc.nextInt();
        vetor[0] = posicao0;
        double posicao1 = sc.nextInt();
        vetor[1] = posicao1;
        double posicao2 = sc.nextInt();
        vetor[2] = posicao2;
        double posicao3 = sc.nextInt();
        vetor[3] = posicao3; */

        System.out.println(vetor);

        sc.close();
    }
}
