package urionlinejudge;

import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int dias = n.nextInt();
        
        int anos = dias / 365;
        int meses = (dias % 365)/30;
        int dia = (dias % 365)% 30; 
        
        
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dia);
    }
    
}
