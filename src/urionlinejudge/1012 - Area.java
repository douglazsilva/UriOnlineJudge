package urionlinejudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");
        
        double A = n.nextDouble();
        double B = n.nextDouble();
        double C = n.nextDouble();
        
        double TRIANGULO = (A * C) / 2;
        double pi = 3.14159;
        double CIRCULO = pi * (Math.pow(C , 2));
        double TRAPEZIO = ((A + B) * C)/2;
        double QUADRADO = B * B;
        double RETANGULO = A * B;
        
        n.close();
        
        System.out.println("TRIANGULO: " + df.format(TRIANGULO));
        System.out.println("CIRCULO: " + df.format(CIRCULO));
        System.out.println("TRAPEZIO: " + df.format(TRAPEZIO));
        System.out.println("QUADRADO: " + df.format(QUADRADO));
        System.out.println("RETANGULO: " + df.format(RETANGULO));
    }
    
}
