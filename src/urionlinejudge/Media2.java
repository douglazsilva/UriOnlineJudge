package urionlinejudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        
        double A = n.nextDouble();
       
        double B = n.nextDouble();
        
        double C = n.nextDouble();
                
        double NFA = (A * 2);
        double NFB = (B * 3);
        double NFC = (C * 5);
        
        double MEDIA = (NFA + NFB + NFC) / (2 + 3 + 5);
                
        System.out.println("MEDIA = " + df.format(MEDIA));
        
    }
    
}
