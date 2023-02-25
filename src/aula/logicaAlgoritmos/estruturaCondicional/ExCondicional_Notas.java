package aula.logicaAlgoritmos.estruturaCondicional;

import java.util.Scanner;

public class ExCondicional_Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1, nota2;

        System.out.println("Nota primeiro semestre: ");
        nota1 = sc.nextFloat();
 
        System.out.println("Nota segundo semestre: ");
        nota2 = sc.nextFloat();

        float notaFinal = nota1 + nota2;

        if(notaFinal < 60.0)
            System.out.printf("NOTA FINAL = %.1f%nREPROVADO", notaFinal);
        else
            System.out.printf("NOTA FINAL = %.1f", notaFinal);

        sc.close();
    }
}
