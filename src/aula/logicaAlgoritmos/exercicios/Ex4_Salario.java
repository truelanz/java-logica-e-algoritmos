package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * 5º Escreva um programa que leia o número de um funcionário, seu número
 * de horas trabalhadas, o valor que recebe por hora e calcula o salário
 * desse funcionário. A seguir, mostre o número e o salário do
 * funcionário, com duas casas decimais.

    Entrada
    O arquivo de entrada contém 2 números inteiros e 1 número com duas
    casas decimais, representando o número, quantidade de horas trabalhadas
    e o valor que o funcionário recebe por hora trabalhada, respectivamente.

    Saída
    Imprima o número e o salário do funcionário, conforme exemplo fornecido,
    com um espaço em branco antes e depois da igualdade. No caso do salário,
    também deve haver um espaço em branco após o $.
 */

public class Ex4_Salario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de funcionários:");
        int numerofuncionarios = sc.nextInt();

        System.out.println("Horas Trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Salário/Hora: ");
        float salarioHora = sc.nextFloat();

        double salarioTotal = horasTrabalhadas * salarioHora;
        System.out.println("Numero = " + numerofuncionarios);
        System.out.printf("Salário = U$ %.2f", salarioTotal);

        sc.close();
    }
    
}
