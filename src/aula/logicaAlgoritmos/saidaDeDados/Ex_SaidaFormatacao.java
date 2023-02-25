package aula.logicaAlgoritmos.saidaDeDados;

import java.util.Locale;

public class Ex_SaidaFormatacao {

    public static void main(String[] args) {
        
        String protuct1 = "Computer";
        String protuct2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:%n%s, which price is $ %.2f%n", protuct1, price1);
        System.out.printf("%s, wich price is $ %.2f%n", protuct2, price2);
        
        System.out.printf("%nRecord: %d year old, code %d and gender: %s%n", age, code, gender);

        System.out.printf("%nMeasure with eight decimal places: %.8f%n" +
        "Rouded (three decimal places): %.3f%n", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
        
    }
    
}
