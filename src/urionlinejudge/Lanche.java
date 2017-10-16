package urionlinejudge;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) {
        
        double total = 0;
        
        Scanner s = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        int codigo = s.nextInt();        
        int quantidade = s.nextInt();
        
        if (codigo == 1) {
            total = 4.00 * quantidade;                             
        }
        if (codigo == 2) {
            total = 4.50 * quantidade;                             
        }
        if (codigo == 3) {
            total = 5.00 * quantidade;                             
        }
        if (codigo == 4) {
            total = 2.00 * quantidade;                             
        }
        if (codigo == 5) {
            total = 1.50 * quantidade;                             
        }
        
        System.out.println("Total: R$ " + df.format(total));
    }
    
}
