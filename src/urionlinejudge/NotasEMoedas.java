
package urionlinejudge;

import java.util.Scanner;

public class NotasEMoedas {


    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double valor = n.nextDouble(); 
        
        int prod =  (int) (valor * 100);
        
        int d1 = prod / 10000;  
        prod = prod % 10000;
        
        int d2 = prod / 5000;
        prod = prod % 5000;
        
        int d3 = prod / 2000;
        prod = prod % 2000;
        
        int d4 = prod / 1000;
        prod = prod % 1000;
        
        int d5 = prod / 500;
        prod = prod % 500;
        
        int d6 = prod / 200;
        prod = prod % 200;
        
        int d7 = prod / 100;
        prod = prod % 100;
        
        int d8 = prod / 50;
        prod = prod % 50;
        
        int d9 = prod / 25;
        prod = prod / 25;
                
        int d10 = prod / 10;
        prod = prod % 10;        
        
        int d11 = prod / 5;
        prod = prod % 5;
        
        int d12 = prod / 1;
        
                 
        
        System.out.printf("NOTAS:\n");        
        System.out.printf("%d nota(s) de R$ 100.00\n", d1);        
        System.out.printf("%d nota(s) de R$ 50.00\n", d2);        
        System.out.printf("%d nota(s) de R$ 20.00\n", d3);        
        System.out.printf("%d nota(s) de R$ 10.00\n",d4);        
        System.out.printf("%d nota(s) de R$ 5.00\n", d5);        
        System.out.printf("%d nota(s) de R$ 2.00\n", d6);
                
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", d7);        
        System.out.printf("%d moeda(s) de R$ 0.50\n", d8);        
        System.out.printf("%d moeda(s) de R$ 0.25\n", d9);        
        System.out.printf("%d moeda(s) de R$ 0.10\n", d10);        
        System.out.printf("%d moeda(s) de R$ 0.05\n", d11);              
        System.out.printf("%d moeda(s) de R$ 0.01\n", d12);   
 
    }
    
}
