package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

public class Ex18_IdadeMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("IDADE: ");
        int idade = sc.nextInt();
        int soma = 0;
        int count = 0;

        while(idade >= 0){
            soma += idade;
            count++;
            System.out.println("IDADE: ");
            idade = sc.nextInt();
        }
        if(count > 0){
            double media = (double) soma / count;
            System.out.printf("%.2f", media);
        }
        else {     
            System.out.println("Impossivel calcular.");
        }
        
        sc.close();

    }
}
