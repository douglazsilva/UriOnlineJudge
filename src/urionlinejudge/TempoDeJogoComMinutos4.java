package urionlinejudge;

import java.util.Scanner;

public class TempoDeJogoComMinutos4 {

    public static void main(String[] args) {
        
        Scanner n =new Scanner(System.in);
        
        int a,b,c,d,i,f,t,h,m;
        
        a = n.nextInt();
        b = n.nextInt();
        c = n.nextInt();
        d = n.nextInt();
        
        a = a * 60;
        c = c * 60;
        i = a + b;
        f = c + d;
        t = f - i;
        
        if(f <= i){
            t = t + (24 * 60);
            h = t / 60;
            m = t % 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h , m);
        }else{
            h = t / 60;
            m = t % 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h , m);
        }
    }
    
}
