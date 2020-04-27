import java.util.Scanner;
import java.text.DecimalFormat; 

public class ValidacaoDeNota {
	
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		int aux1 = 0;
		int aux2 = 0;
		
		double N1 = 0;
		double N2 = 0;
		
		while(aux1 == 0){
			double ni1 = Double.parseDouble(s.nextLine());
			if(ni1 >= 0 && ni1 <= 10){
				N1 = ni1;
				aux1 = 1;				
			} else {
				System.out.println("nota invalida");
			}
		}
		
		while(aux2 == 0){
			double ni2 = Double.parseDouble(s.nextLine());
			if(ni2 >= 0 && ni2 <= 10){
				N2 = ni2;
				aux2 = 1;				
			} else {
				System.out.println("nota invalida");
			}
		}
		
		double resultado = (N1 + N2) / 2;
		String resultadoComVirgula = df.format(resultado);
		String resultadoComPonto = resultadoComVirgula.replace(",", ".");
		System.out.println("media = " + resultadoComPonto);
	}
}