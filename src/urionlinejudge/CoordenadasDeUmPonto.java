package urionlinejudge;

import java.util.Scanner;

public class CoordenadasDeUmPonto {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double x = n.nextDouble();
        double y = n.nextDouble();
        
        if((x > 0)&& (y > 0)){
            System.out.printf("Q1\n");        
        }
        
        if((x < 0)&& (y > 0)){
            System.out.printf("Q2\n");        
        }
        
        if((x < 0)&& (y < 0)){
            System.out.printf("Q3\n");        
        }
       
        if((x > 0)&& (y < 0)){
            System.out.printf("Q4\n");        
        }
        
        if((x == 0)&& (y == 0)){
            System.out.printf("Origem\n");        
        }
        
        if((x == 0)&& (y != 0)){
            System.out.printf("Eixo Y\n");        
        }
        
        if((y == 0)&& (x != 0)){
            System.out.printf("Eixo X\n");        
        }        
    }
    
}
