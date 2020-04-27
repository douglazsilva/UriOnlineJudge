import java.io.IOException;
import java.util.Scanner;

public class Experiencias {
 
    public static void main(String[] args) throws IOException {
         
        int n, quantia, total = 0, totalC = 0, totalR = 0, totalS = 0;
		double perC, perR, perS;
		String tipo;
		String p = " %\n";
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			quantia = sc.nextInt();
			tipo = sc.next();
			if(tipo.equals("C")){
				totalC += quantia;
			} else if(tipo.equals("R")){
				totalR += quantia;
			} else if(tipo.equals("S")){
				totalS += quantia;
			}				
		}
		
		total = totalC + totalR + totalS;
			
		perC = (double)totalC * 100 / total;
		perR = (double)totalR * 100 / total;
		perS = (double)totalS * 100 / total;
		
		String perCVirgula = String.format("%.2f", perC);
		String perCPonto = perCVirgula.replace(",", ".");
		
		String perRVirgula = String.format("%.2f", perR);
		String perRPonto = perRVirgula.replace(",", ".");
		
		String perSVirgula = String.format("%.2f", perS);
		String perSPonto = perSVirgula.replace(",", ".");
		
		System.out.print("Total: " + total + " cobaias\n");
		System.out.print("Total de coelhos: " + totalC+ "\n");
		System.out.print("Total de ratos: " + totalR + "\n");
		System.out.print("Total de sapos: " + totalS + "\n");
		System.out.print("Percentual de coelhos: " + perCPonto + p);
		System.out.print("Percentual de ratos: " + perRPonto + p);
		System.out.print("Percentual de sapos: " + perSPonto + p);
    } 
}