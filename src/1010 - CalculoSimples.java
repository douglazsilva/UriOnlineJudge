package urionlinejudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
                 
        Scanner n = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        
        int codigo1 = n.nextInt();
        int quantidade1 = n.nextInt();        
        double preco1 = n.nextDouble();
        double total1 = quantidade1 * preco1;
        
        int codigo2 = n.nextInt();
        int quantidade2 = n.nextInt();
        double preco2 = n.nextDouble();
        double total2 = quantidade2 * preco2;
        
        double valorTotal = total1 + total2;
        
        System.out.println("VALOR A PAGAR: R$ " + df.format(valorTotal));
        
    }
    
}
