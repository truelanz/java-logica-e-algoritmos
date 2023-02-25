package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 *20º Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o 
 * lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes 
 * três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
 * 
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 */
public class Ex20_TiposTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        double numero3 = sc.nextDouble();

        double a, b, c;
        
        //ESTRUTURA DE ORDEM CRESCENTE/DECRESCENTE\\
        if (numero1 > numero2 && numero1 > numero3) {
			a = numero1;
			if (numero2 > numero3) {
				b = numero2;
				c = numero3;
			}
			else {
				b = numero3;
				c = numero2;
			}
		}

		else if (numero2 > numero3) {
			a = numero2;
			if (numero1 > numero3) {
				b = numero1;
				c = numero3;
			}
			else {
				b = numero3;
				c = numero1;
			}
		}

		else {
			a = numero3;
			if (numero1 > numero2) {
				b = numero1;
				c = numero2;
			}
			else {
				b = numero2;
				c = numero1;
			}
		}

        //A ≥ B+C
        if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");  

        }
       
        //A2 = B2 + C2
        else { 
        
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("TRIANGULO RETANGULO");

        }
        
        //A2 > B2 + C2
        else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("TRIANGULO OBTUSANGULO");

        }
        
        //A2 < B2 + C2 
        else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("TRIANGULO ACUTANGULO");

        }
        
        if (a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");

        }
        
        else if (a == b || a == c || b == c){
            System.out.println("TRIANGULO ISOSCELES");

        }
    }

        sc.close();      
    }
}
    
    
