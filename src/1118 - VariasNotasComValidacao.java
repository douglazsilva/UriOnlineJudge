import java.util.Scanner;
import java.text.DecimalFormat; 

public class VariasNotasComValidacao {	
	public static void main(String[] args){	
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");

		int x = 1;
		
		while(x == 1){			
			int aux = 0;		
			double n = 0;

			while(aux < 2){
				double ni = Double.parseDouble(s.nextLine());
				if(ni >= 0 && ni <= 10){
					n = n + ni;
					aux += 1;				
				} else {
					System.out.println("nota invalida");
				}			
			}

			double resultado = n / 2;
			String resultadoComVirgula = df.format(resultado);
			String resultadoComPonto = resultadoComVirgula.replace(",", ".");
			System.out.println("media = " + resultadoComPonto);
			
			int aux2 = 0;
			while(aux2 == 0){
				System.out.println("novo calculo (1-sim 2-nao)");
				aux2 = s.nextInt();
				if(aux2 == 1){
					x = 1;
				} else if(aux2 == 2){
					x = 2;
				} else if(aux2 != 1 && aux2 != 2){
					aux2 = 0;
				}
				s.nextLine();								
			}			
		}	
	}
}