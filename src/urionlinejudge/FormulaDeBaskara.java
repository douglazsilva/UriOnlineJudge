package urionlinejudge;

import java.util.Scanner;

public class FormulaDeBaskara {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double a = n.nextDouble();
        double b = n.nextDouble();
        double c = n.nextDouble();
        
        double x = (b * b) - (4 * a * c);
        
        if(x < 0){
            System.out.printf("Impossivel calcular\n");
        } else if (a == 0){
            System.out.printf("Impossivel calcular\n");        
        } else {
            double r1 = (-b + Math.sqrt(x)) / (a + a);
            double r2 = (-b - Math.sqrt(x)) / (a + a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
        
    }
    
}
