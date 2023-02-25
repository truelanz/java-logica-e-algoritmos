package aula.logicaAlgoritmos.entradaDeDados;

import java.util.Scanner;

public class EntradaScanner {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         /*
         * sc.next(); Para Ler a primeira palavra
         * sc.nextLine(); para ler um texto até a aquebra de linha (apertar enter).
         * sc.nextInt(); para ler int
         * sc.nextDouble(); para ler double.
         * sc.next().charAt(0); ler o character na posição indicada.
         */

        //.nextLine(); (até a quebra de linha).
        String a;
        System.err.println("\nApós apertar enter seu texto será salvo;");
        a = sc.nextLine();
        System.out.println("Você digitou: " + a);

        //usando diferentes entradas de dados com o .nextLine()
        int i;
        String s1, s2, s3;
        i = sc.nextInt();
        sc.nextLine(); //Usa-se um comando vazio para ser consumido após o nextInt/Double.etc();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("\n" + i + "\n" + s1 + "\n" + s2 + "\n" + s3);
        
        //.next(); (a primeira palavra).
        System.out.println("\nNome:");
        String nome = sc.next();
        System.out.printf("Seu nome é %s!%n", nome);

        //.next().charAt(0); (imprimir uma letra na ordem especificada).
        System.out.println("\nEscreva qualquer coisa: ");
        char letra = sc.next().charAt(0);
        System.out.printf("O primeiro character: %s!%n", letra);

        //Digitar mais de um dado em uma mesma linha:
        String seuNome;
        int suaIdade;
        double suaAltura;
        System.out.println("\nDigite seu nome, sua idade e sua altura: ");
        seuNome = sc.next(); 
        suaIdade = sc.nextInt();
        suaAltura = sc.nextDouble();
        System.out.println("\nNome: " + seuNome + ", Idade: " + suaIdade + ", Altura: " + suaAltura);

        
        sc.close(); 
    }
    
}
