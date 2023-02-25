package aula.logicaAlgoritmos.estruturaRepetitiva;

import java.util.Scanner;

public class ForPara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros = sc.nextInt();
        int soma = 0;
        for(int count = 0; count < quantidadeNumeros; count++){
            int numero = sc.nextInt();
            soma += numero;

        }
        System.out.println(soma);

        sc.close();
    }
    
}
