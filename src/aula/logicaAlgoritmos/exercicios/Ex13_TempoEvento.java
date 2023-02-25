package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 * 13º Pedrinho está organizando um evento em sua Universidade. O evento deverá ser
 *  no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho
 *  quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando
 *  inicia e quando termina o evento.

	Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar
	Pedrinho a calcular a duração deste evento.

	Entrada
	Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia
	do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o
	evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá
	outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

	Saída
	Na saída, deve ser apresentada a duração do evento, no seguinte formato:

	W dia(s)
	X hora(s)
	Y minuto(s)
	Z segundo(s)
 */
public class Ex13_TempoEvento {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
		
		int diaInicio, horaInicio, minutoInicio, segundoInicio, diaFim, 
		horaFim, minutoFim, segundoFim, compararDiaHoraMinutoSegundo1, compararDiaHoraMinutoSegundo2, sobra, 
		dias, horas, minutos, segundos, resto;
		String string;

		System.out.println("Dia do mês que o evendo vai começar: ");
		string = sc.next();
		diaInicio = sc.nextInt();

		System.out.println("Digite a hora : minuto : segundo que o evento comecará: ");
		horaInicio = sc.nextInt();
		string = sc.next();
		minutoInicio = sc.nextInt();
		string = sc.next();
		segundoInicio = sc.nextInt();
		
		System.out.println("Dia do mês que o evendo vai terminar: ");
		string = sc.next();
		diaFim = sc.nextInt();

		System.out.println("Digite a hora : minuto : segundo que o evento terminará: ");
		horaFim = sc.nextInt();
		string = sc.next();
		minutoFim = sc.nextInt();
		string = sc.next();
		segundoFim = sc.nextInt();

		compararDiaHoraMinutoSegundo1 = diaInicio * 24*60*60 + horaInicio*60*60 + minutoInicio*60 + segundoInicio;
		compararDiaHoraMinutoSegundo2 = diaFim * 24*60*60 + horaFim*60*60 + minutoFim*60 + segundoFim;
		if(compararDiaHoraMinutoSegundo1 < compararDiaHoraMinutoSegundo2)
		sobra = compararDiaHoraMinutoSegundo2 - compararDiaHoraMinutoSegundo1;
		else sobra = compararDiaHoraMinutoSegundo1 - compararDiaHoraMinutoSegundo2;

		dias = sobra / (24*60*60);
		resto = sobra % (24*60*60);
		horas = resto / (60*60);
		resto = resto % (60*60);
		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");

		sc.close();
}}
