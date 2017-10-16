
package urionlinejudge;

import java.util.Scanner;

public class TempoDeJogo {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in); 
        
        int x = n.nextInt();
        int y = n.nextInt();
        int z;
        
        if(x == y){
            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        }else if(y > x){
            z = y - x;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", z);
        }else if(x > y){
            z = (y + 24)- x;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", z);
        }
    }    
}
