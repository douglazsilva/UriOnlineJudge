import java.util.Scanner;

public class DividindoXPorY {
	
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for(int i = 0; i < N; i++){		
			int x = s.nextInt();
			int y = s.nextInt();
			if (y == 0){
				System.out.println("divisao impossivel");
			} else {
				double resultado = (double)x / y;
				System.out.println(resultado);
			}
		}
	}
}