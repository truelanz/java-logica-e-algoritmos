package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número N, depois nome (apenas uma
palavra sem espaços), idade e altura de N pessoas.

 * Depois, mostrar na tela a altura média das pessoas, e mostrar também a
porcentagem de pessoas com menos de 16 anos.
 */
public class Ex27_VetorMediaIdadeAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = sc.nextInt();

        String[] nome = new String[tamanhoVetor];
        int[] idade = new int[tamanhoVetor];
        double[] altura = new double[tamanhoVetor];
        double soma = 0.0;

        for(int i = 0; i < tamanhoVetor; i++){
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }
        for(int i = 0; i < tamanhoVetor; i++){
            soma += altura[i];
        }

        double media = soma / altura.length;
        double abaixoDe16 = 0;

        for(int i = 0; i <tamanhoVetor; i++){
            if(idade[i] < 16)
            abaixoDe16++;
        }
        double porcentagem = abaixoDe16 * 100.0 / idade.length;

        System.out.printf("Altura média: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", porcentagem);

        
        sc.close();
    }
    
}
