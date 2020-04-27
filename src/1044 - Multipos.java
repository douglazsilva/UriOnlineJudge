package urionlinejudge;

import java.util.Scanner;

public class Multipos {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int A = s.nextInt();
        int B = s.nextInt();
        
        if((B % A == 0)||(A % B == 0)){
            System.out.printf("Sao Multiplos\n");
        }else{        
            System.out.printf("Nao sao Multiplos\n");
        }
    }
    
}
