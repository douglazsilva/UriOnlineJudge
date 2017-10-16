package urionlinejudge;

import java.util.Scanner;

public class FormulaDeBhaskara {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double A = n.nextDouble();
        double B = n.nextDouble();
        double C = n.nextDouble();
        
        double delta = Math.pow(B,2) -4 * A * C; 
        double R1 = -B + Math.sqrt(delta) / 2 * A; 
        double R2 = -B - Math.sqrt(delta) / 2 * A;
        
        System.out.println("R1 = " + R1);
        System.out.println("R2 = " + R2);
    }
    
}
