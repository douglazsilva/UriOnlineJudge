package urionlinejudge;

import java.util.Scanner;

public class SortSimples {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int n1 = n.nextInt();
        int n2 = n.nextInt();
        int n3 = n.nextInt();
       
        int x = n1;
        int y = n2;
        int z = n3;
        
        int aux;
        
        if (x > y){
            aux = x;
            x = y;
            y = aux;        
        }
        
        if (x > z){
            aux = x;
            x = z;
            z = aux;       
        }
        
        if (y > z){
            aux = y;
            y = z;
            z = aux;
        }
        
        System.out.printf("%d\n" , x);
        System.out.printf("%d\n" , y);
        System.out.printf("%d\n" , z);
        System.out.printf("\n");        
        System.out.printf("%d\n" , n1);
        System.out.printf("%d\n" , n2);
        System.out.printf("%d\n" , n3);
    }
    
}
