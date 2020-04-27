import java.util.Scanner;

public class SomandoInteirosConsecutivos{
	
	public static void main(String[] args){
		
		int soma = 0;
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int n = input.nextInt();
		
		while(n <= 0) {
			n = input.nextInt();
		} 
		
		for(int i = 0; i < n ; i++){
			soma += (a + i);
		}
		System.out.println(soma);
	}
}