package urionlinejudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComBonus {


    public static void main(String[] args) {
        
            Scanner n = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#0.00");
            
            String nome = n.nextLine();
            double salarioFixo = n.nextDouble();
            double montanteTotal = n.nextDouble();
            
            double total = salarioFixo + (montanteTotal * 0.15);
            
            System.out.println("TOTAL = R$ " + df.format(total));
            System.out.println(total);
        
        
    }
    
}
