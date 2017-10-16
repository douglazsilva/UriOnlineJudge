package urionlinejudge;

import java.util.Scanner;

public class TesteDeSelecao1 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int A = n.nextInt();
        int B = n.nextInt();
        int C = n.nextInt();
        int D = n.nextInt();
        
        int somaCD = C + D;
        int somaAB = A + B;
        
        if ((B > C) && (D > A) && (somaCD > somaAB) && (C > 0) && (D > 0) &&(A % 2 == 0)){
            System.out.printf("Valores aceitos\n");        
        } else{
            System.out.printf("Valores nao aceitos\n");        
        }
    }
    
}
