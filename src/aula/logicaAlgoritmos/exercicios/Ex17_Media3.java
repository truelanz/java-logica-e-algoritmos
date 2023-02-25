package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;

/*
 *17º Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente
 * às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para
 * cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta
 * média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada
 * for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor
 * entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média
(some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a
mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.",
(caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame)
apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme
a descrição do problema. Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá
"Presentation Error".
 */
public class Ex17_Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float n1, n2, n3, n4, exame, mediaFinal;
        float pesoN1 = 2f;
        float pesoN2 = 3f;
        float pesoN3 = 4f;
        float pesoN4 = 1f;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        float media = (n1 * pesoN1 + n2 * pesoN2 + n3 * pesoN3 + n4 * pesoN4) / 10f;

        System.out.printf("Media: %.1f%n", media);
        
        if(media >= 7f)
            System.out.println("Aluno Aprovado.");
        else if(media < 5f)
            System.out.println("Aluno reprovado.");

        else{ 
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: ");
            exame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);

            mediaFinal = (media + exame) / 2f;
            if(mediaFinal >= 5f)
                System.out.println("Aluno aprovado");
            else System.out.println("Aluno reprovado");

            System.out.printf("Media final: %.1f", mediaFinal);
        }


        sc.close();
    }  
}
