package aula.logicaAlgoritmos.saidaDeDados;

import java.util.Locale;

public class SaidaFormatacao {
    public static void main(String[] args) throws Exception {
        double x = 50.26685421;
        System.out.println(x);
        /* "%.2f" <-- LIMITAR CASAS DECIMAIS usando printf (1 uma casa, 2 duas casas, etc...)
        "\n ou %n" <-- para colocar quebra de linha */
        System.out.printf("%.3f%n", x);
        
        //Locale Muda as configs e afins da máquina para padrões da localização indicada.
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", x);
        System.out.printf("RESULTADO = %.1f metros\n", x);

        System.out.println("---");

        /* printf -> (%f = ponto flutuante, double e float)
        (%d = inteiro, int, long, byte)
        (%s = texto, String, char)
        (%n ou \n = quebra de linha) */
        int idade = 55;
        float renda = 85000f;
        String nome = "Cesar";
        System.out.printf("%s tem %d anos e ganha %.2f por mês.%n", nome, idade, renda);


    }
}
