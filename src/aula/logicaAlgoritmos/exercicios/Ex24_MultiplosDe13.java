package aula.logicaAlgoritmos.exercicios;
/*
 *24º Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos 
 * números que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente 
em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores 
lidos na entrada, inclusive ambos se for o caso.
 */

import java.util.Scanner;

public class Ex24_MultiplosDe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int menor, maior;
        int soma = 0;
        
        //ver qual o menor número entre os dois
        if(numero1 < numero2){
            menor = numero1;
            maior = numero2;
        }
        else{
            menor = numero2;
            maior = numero1;
        }


        for(int i = menor; i <= maior; i++){
            //checando de número não é mútiplo de 13
            if(i % 13 != 0){
                soma += i;
            }
        }
        System.out.println(soma);

        

        


        sc.close();
    }
    
}
