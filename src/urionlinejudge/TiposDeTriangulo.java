package urionlinejudge;

import java.util.Scanner;

public class TiposDeTriangulo {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double x, y, z, aux;
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        
        if (A < B){            
            aux = A; A = B; B = aux;
        }
        if (A < C){
            aux = A; A = C; C = aux;
        }
        if (B < C){
            aux = B; B = C; C = aux;
        }
        
        x = Math.pow(A, 2);
        y = Math.pow(B, 2);
        z = Math.pow(C, 2);
        
        if(A >= B +C){
            System.out.printf("NAO FORMA TRIANGULO\n");
        }else{
            if(x == y + z){
                System.out.printf("TRIANGULO RETANGULO\n");
            }
            if(x > y+z){
                System.out.printf("TRIANGULO OBTUSANGULO\n");
            }
            if(x < y+z){
                System.out.printf("TRIANGULO ACUTANGULO\n");
            }
            if(A == B && B ==C){
                System.out.printf("TRIANGULO EQUILATERO\n");
            } else if(A == B || B == C || C ==A){
                System.out.printf("TRIANGULO ISOSCELES\n");            
            }
        }
        
        
       
       
    }
    
}
