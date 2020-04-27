package urionlinejudge;

import java.util.Scanner;

public class CoordenadasDeUmPonto {

    public static void main(String[] args) {
        
        Scanner e = new Scanner (System.in);
        float x = e.nextFloat();
        float y = e.nextFloat();
        if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        if(x == 0 && y != 0 ){
			System.out.println("Eixo Y"); 
        }
        if(x != 0 && y == 0 ){
           System.out.println("Eixo X"); 
        }
        if (x == 0 && y == 0){
          System.out.println("Origem");
        }        
    }    
}
