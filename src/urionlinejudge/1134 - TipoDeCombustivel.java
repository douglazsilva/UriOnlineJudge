import java.util.Scanner;

public class TipoDeCombustível {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		boolean run = true;
		int n = 0;
		
		while(run){			
			n = input.nextInt();
			if (n == 1) {
				alcool += 1;
			} else if ( n == 2) {
				gasolina += 1;
			} else if ( n == 3) {
				diesel += 1;
			} else if (n == 4) {
				run = false;
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
			}
		}
	}
}