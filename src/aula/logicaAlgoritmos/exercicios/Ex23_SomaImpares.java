package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 *23º Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre
os valores fornecidos na entrada que deverá caber em um inteiro.
 */
public class Ex23_SomaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int soma = 0;
        int min, max;

        if(numero1 < numero2){
            min = numero1;
            max = numero2;
        }
        else{
            min = numero2;
            max = numero1;
        }
        
        for(int i = min + 1; i < max; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }
        System.out.println(soma);

        sc.close();
    }
    
}
