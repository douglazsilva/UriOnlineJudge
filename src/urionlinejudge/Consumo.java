package urionlinejudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");
        
        int X = n.nextInt();
        double Y = n.nextDouble();
        
        double consumo = X / Y;
        
        System.out.println(df.format(consumo) + " km/l");
    }
    
}
