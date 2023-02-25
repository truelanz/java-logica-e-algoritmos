package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento
 * em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
 */

public class Ex12_ConversaoTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
	}
}