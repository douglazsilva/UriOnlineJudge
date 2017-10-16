package urionlinejudge;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00000");
        
        double A = n.nextDouble();
       
        double B = n.nextDouble();      
                
        double NFA = (A * 3.5);
        double NFB = (B * 7.5);
        
        double MEDIA = (NFA + NFB) / (3.5f + 7.5f);
                
        System.out.println("MEDIA = " + df.format(MEDIA));
        
        
        
        /**Locale.setDefault(Locale.US); // &lt;==================================
	Double latitude = 1.21456D;  
	NumberFormat format = NumberFormat.getInstance();  
            format.setMaximumFractionDigits(1);  
            format.setMinimumFractionDigits(1);  
            //format.setMaximumIntegerDigits(2);  
            //format.setRoundingMode(RoundingMode.HALF_UP);  
	latitude = Double.valueOf(format.format(latitude));
	System.out.println(latitude);
        */
    }
    
}
