package urionlinejudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

     public static void main(String[] args) {
         
            Scanner n = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#0.00");
				
	    int NUMBER = n.nextInt();
	    int HOURS = n.nextInt();
	    float HOURS_VALUE = n.nextFloat();
	    float SALARY = (HOURS * HOURS_VALUE);
	
	    System.out.println("NUMBER = " + NUMBER);
            System.out.println("SALARY = U$ " + df.format(SALARY));
        
    }
    
}
