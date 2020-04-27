import java.util.Scanner;

public class CrescenteDecrescente{
	
	public static void main(String[] args){
	
		int x, y, aux = 1;
		Scanner s = new Scanner(System.in);
		
		while(aux == 1){
		
			x = s.nextInt();
			y = s.nextInt();
			
			if(x > y){
				System.out.print("Decrescente\n");
			}else if(x < y){
				System.out.print("Crescente\n");
			}else if(x == y){
				aux = 0;
			}		
		}		
	}
}