package urionlinejudge;

import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int km = n.nextInt();
        
        float distancia = 0.5f;
        
        float min = km / distancia;
        
        System.out.printf("%.0f minutos\n", min);
        
        
    }
    
}
