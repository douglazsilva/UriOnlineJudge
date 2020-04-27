package urionlinejudge;

import java.util.Scanner;

public class ConversaoDeTempo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int hora = 3600;
        int minuto = 60;
                
        int N = input.nextInt();
        
        int h = N / hora;
        int m = (N -(h * hora))/60;
        int s = N % minuto;
        
        System.out.printf("%d:%d:%d\n" , h, m, s);       
    }   
}
