package urionlinejudge;

import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int nota100 = 100;
        int nota50 = 50;
        int nota20 = 20;
        int nota10 = 10;
        int nota5 = 5;
        int nota2 = 2;
        int nota1 = 1;
        
        int valor = n.nextInt();
        
        int div1 = valor / nota100;
        int resto1 = valor % nota100;
        
        int div2 = resto1 / nota50;
        int resto2 = resto1 % nota50;
        
        int div3 = resto2 / nota20;
        int resto3 = resto2 % nota20;
        
        int div4 = resto3 / nota10;
        int resto4 = resto3 % nota10;
        
        int div5 = resto4 / nota5;
        int resto5 = resto4 % nota5;
        
        int div6 = resto5 / nota2;
        int resto6 = resto5 % nota2;

        int div7 = resto6 / nota1;                
        
        System.out.printf("%d\n", valor);        
        System.out.printf("%d nota(s) de R$ 100,00\n" , div1);        
        System.out.printf("%d nota(s) de R$ 50,00\n" , div2);        
        System.out.printf("%d nota(s) de R$ 20,00\n" , div3);        
        System.out.printf("%d nota(s) de R$ 10,00\n" , div4);        
        System.out.printf("%d nota(s) de R$ 5,00\n" , div5);        
        System.out.printf("%d nota(s) de R$ 2,00\n" , div6);        
        System.out.printf("%d nota(s) de R$ 1,00\n" , div7);
        
        
    }
    
}
