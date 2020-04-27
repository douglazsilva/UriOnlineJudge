package urionlinejudge;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        
        if((A + B > C) && (B + C > A) && (A + C > B)){
            System.out.printf("Perimetro = %.1f\n", A + B + C);
        }else{
            System.out.printf("Area = %.1f\n", ((A + B) * C) / 2);
        }
    }
    
}
