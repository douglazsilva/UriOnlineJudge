import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples {
 
    public static void main(String[] args) throws IOException {
 
        Scanner n = new Scanner(System.in);
				
		int A = n.nextInt();
		int B = n.nextInt();		
		int PROD = A * B;
		
		System.out.printf("PROD = %d\n", PROD);
    }
 
}