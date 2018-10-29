package urionlinejudge;

import java.util.Scanner;


public class NumerosPositivos {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double n1, n2, n3, n4, n5, n6;
        
        n1 = n.nextDouble();
        n2 = n.nextDouble();
        n3 = n.nextDouble();
        n4 = n.nextDouble();
        n5 = n.nextDouble();
        n6 = n.nextDouble();
        
        int num = 0;
        
        if (n1>0){            
            num++;
        }
        
        if (n2>0){            
            num++;
        }
        if (n3>0){            
            num++;
        }
        if (n4>0){            
            num++;
        }
        if (n5>0){            
            num++;
        }
        if (n6>0){
            num++;
        }
        
        System.out.println(num + " valores positivos");
    }
    
}
