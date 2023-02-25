package aula.logicaAlgoritmos.saidaDeDados;

public class Casting {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double resultado;

        resultado = a / b;
        System.out.println(resultado);
        
        resultado = (double) a / b; //<-- CASTING double/int.
        System.out.println(resultado);

        double d = 5.264;
        int i;

        i = (int) d; // <-- CASTING int/double.
        System.out.println("\n" + i);
        
    }
    
}
