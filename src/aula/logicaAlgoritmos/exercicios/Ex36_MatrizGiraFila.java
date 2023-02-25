package aula.logicaAlgoritmos.exercicios;

import java.util.Scanner;
/*
 * 36º O sargento Silva organiza seu pelotão em M filas numeradas a partir de 1, 
 * sendo cada fila com a mesma quantidade de soldados. Por exemplo, a organização
 * do pelotão em 3 filas com 8 soldados em cada uma.
 * 
Um dos exercícios que o sargento Silva realiza com o pelotão é o exercício "girar fila", 
que consiste em dizer o número de uma fila, de modo que os soldados desta fila devem se 
mover para a direita, e o último soldado da direita vai para a posição mais à esquerda. 
Você deve fazer um programa para ler a formação do pelotão e executar o exercício "girar fila".

Entrada:
A entrada consiste em um inteiro M representando o número de filas, um inteiro N representado a quantidade de soldados
por fila, as M filas de soldados (cada soldado é representado por um número inteiro), e o número inteiro para o exercício
"girar fila".

Saída:
A saída contém a formação do pelotão após a execução do exercício "girar fila".
 */
public class Ex36_MatrizGiraFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhaM = sc.nextInt(); //3
        int colunaN = sc.nextInt(); //8

        int[][] matriz = new int[linhaM][colunaN];

        for(int i = 0; i < linhaM; i++){
            for(int j = 0; j < colunaN; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //"Mover para a direita, e o último soldado da direita vai para a posição mais à esquerda."

        //Decrescer -1 na fila especificada.
        int linha = sc.nextInt();
        linha--;
        
        //(Coluna - 1) = Útimo elemento da fila, pois a fila começa no zero.
        //Linha especificada e útima coluna dessa linha armazenada na variável "ultimoDaFila"...
        int ultimoDaFila = matriz[linha][colunaN-1]; 
        //Movendo elementos +1 para a direita (da direita para a esquerda):
        for(int j = colunaN-1; j > 0; j--){
            matriz[linha][j] = matriz[linha][j-1];
        }
        //armazenar o útimo da fila no começo, já que o mesmo foi movido +1 para a direita.
        matriz[linha][0] = ultimoDaFila;
        //Imprimir na tela de maneira padrão.
        for(int i = 0; i < linhaM; i++){
            for(int j = 0; j < colunaN; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
