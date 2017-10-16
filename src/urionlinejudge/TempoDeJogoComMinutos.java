package urionlinejudge;

import java.util.Scanner;

public class TempoDeJogoComMinutos {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in); 
        
        int x = n.nextInt(), j = n.nextInt();
        int y = n.nextInt(), k = n.nextInt();
        int z, l;
        
        if(j > k){
            k +=60;
            z = k - j;
            if(x == y){
                System.out.printf("O JOGO DUROU 24 HORA(S) E %d MINUTOS\n", z);
            }else if(x < y){
                l = y - x - 1;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS\n", l, z);
            }else if(x > y){
                l = (y + 24)- x - 1;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS\n", l, z);
            }
        }else{
            if (j < k) {
                z = k - j;
            } else {
                z = 0;                
            }
            if(x == y){                
                System.out.printf("O JOGO DUROU 24 HORA(S) E %d MINUTOS\n", z);
            }else if(x < y){
                l = y - x;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS\n", l, z);
            }else if(x > y){
                l = (y + 24) - x;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS\n", l, z);
            }
            
        }
        
        
        
        
    }
    
}
