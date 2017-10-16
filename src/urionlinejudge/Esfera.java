package urionlinejudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {
                         
        Scanner n = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");
        
        double raio = n.nextDouble();
        double pi = 3.14159;
        
        double volume = (4/3.0) * pi * Math.pow(raio, 3);
                
        System.out.println("VOLUME = " + df.format(volume));
        
    }
    
}
