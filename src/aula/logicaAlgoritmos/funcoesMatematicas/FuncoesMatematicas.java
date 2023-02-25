package aula.logicaAlgoritmos.funcoesMatematicas;

import java.lang.Math;
/**
 * Java tem vários métodos de funções matemáticas. Usando esse métodos conseguimos melhor performace:
 * "Os geradores de código são incentivados a usar bibliotecas nativas específicas da plataforma ou
 *  instruções de microprocessador, quando disponíveis, para fornecer implementações de métodos matemáticos de alto desempenho.
 *  Essas implementações de alto desempenho ainda devem estar em conformidade com a especificação para Math."
 * @see <a href="https://docs.oracle.com/javase/6/docs/api/java/lang/Math.html"> Documentacao Oracle</a>
 */

public class FuncoesMatematicas {

    public static void main(String[] args) {
        
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double absoluto = -58.23;
        double a, b, c;

        // Math.sqrt(); CALCULAR RAIZ QUADRADA;
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + y + " = " + b);
        System.out.println("Raiz quadrada de 25 = " + c);

        // Math.pow(); CALCULAR POTENCIA.
        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        System.out.println("\n" + x + " elevado a " + y + " = " + a);
        System.out.println(x + " elevado ao quadrado = " + b);
        System.out.println("5.0 elevado ao quadrado = " + c);
        
        //Math.abs(); CALCULAR VALOR ABSOLUTO;
        a = Math.abs(z);
        b = Math.abs(absoluto);
        System.out.println("Valor absoluto de " + z + " = " + a);
        System.out.println("Valor absoluto de " + absoluto + " = " + b);

    }


    
}
