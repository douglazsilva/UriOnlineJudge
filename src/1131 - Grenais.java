import java.util.Scanner;

public class Grenais{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int aux = 0;
		int grenais = 0;
		int golI = 0;
		int vitI = 0;
		int golG = 0;
		int vitG = 0;		
		int emp = 0;
		int opt = 0;
		String venc = "";
		
		while(aux == 0){
			golI = input.nextInt();
			golG = input.nextInt();
			if(golI > golG){
				vitI += 1;
			} else if(golI < golG){			
				vitG += 1;
			} else if(golI == golG){
				emp += 1;
			}
			grenais += 1;
			System.out.println("Novo grenal (1-sim 2-nao)");
			opt = input.nextInt();
			if(opt == 2){
				aux = opt;
				if(vitI > vitG){
					venc = "Inter venceu mais";
				} else if(vitG > vitI){
					venc = "Gremio venceu mais";
				} else {
					venc = "Nao houve vencedor";
				}
				System.out.println(grenais + " grenais\nInter:" + vitI + "\nGremio:" + vitG + "\nEmpates:" + emp + "\n" + venc);
			}
		}	
	}
}