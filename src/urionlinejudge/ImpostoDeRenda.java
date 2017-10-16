package urionlinejudge;

import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double renda = s.nextDouble();
        
        if(renda <= 2000){
            System.out.printf("Isento\n");
        }else if(renda > 2000.01){
            renda = renda - 2000;
            System.out.println(renda); 
        }
        
    }
    
}
