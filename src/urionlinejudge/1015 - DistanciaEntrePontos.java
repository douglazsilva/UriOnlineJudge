package urionlinejudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntrePontos {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");
        
        double x1 = n.nextDouble();
        double y1 = n.nextDouble();
        double x2 = n.nextDouble();
        double y2 = n.nextDouble();

        double distancia = Math.sqrt( Math.pow( (x1 - x2),2 ) + Math.pow( (y1 - y2),2 ) );
        
        System.out.println(df.format(distancia));
    }
    
}
