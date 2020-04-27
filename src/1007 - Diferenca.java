import java.io.IOException;
import java.util.Scanner;

public class Diferenca {
 
    public static void main(String[] args) throws IOException {
 
        Scanner n = new Scanner(System.in);
				
		int A = n.nextInt();
		int B = n.nextInt();
		int C = n.nextInt();
		int D = n.nextInt();
		int DIFERENCA = (A * B - C * D);
		
		System.out.printf("DIFERENCA = %d\n", DIFERENCA);
 
    } 
}