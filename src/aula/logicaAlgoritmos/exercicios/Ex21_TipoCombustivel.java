package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 *21º Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus 
 * clientes. Escreva um algoritmo para ler o tipo de combustível abastecido 
 * (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um 
 * novo código (até que seja válido). 
 * 
 * O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes 
que abasteceram cada tipo de combustível, conforme exemplo.
 */

public class Ex21_TipoCombustivel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipoCombustivel = sc.nextInt();

        while(tipoCombustivel != 4){
            if(tipoCombustivel == 1){
                ++alcool;
            }
            else if(tipoCombustivel == 2){
                ++gasolina;
            }
            else if(tipoCombustivel == 3){
                ++diesel;
            }
            else
                System.out.println("Digite outro número, de 1 a 4: ");
                tipoCombustivel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!\nAlcool: " + alcool + "\nGasolina: "
        + gasolina + "\nDiesel: " + diesel);
        

        sc.close();
    }
    
}
