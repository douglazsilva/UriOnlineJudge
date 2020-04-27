package urionlinejudge;

import java.io.IOException;
import java.util.Scanner;
 
public class SomaSimples {
 
    public static void main(String[] args) throws IOException {
          
        Scanner n = new Scanner(System.in);
				
		int A = n.nextInt();
		int B = n.nextInt();		
		int SOMA = A + B;
		
		System.out.printf("SOMA = %d\n", SOMA);
 
    } 
}
