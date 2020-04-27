import java.util.Scanner;

public class Quadrante{
	
	public static void main(String[] args){
	
		int x, y, aux = 1;
		Scanner s = new Scanner(System.in);
		
		while(aux == 1){
		
			x = s.nextInt();
			y = s.nextInt();
			
			if(x>0 && y>0){
				System.out.print("primeiro\n");
			}else if(x<0 && y>0){
				System.out.print("segundo\n");
			}else if(x<0 && y<0){
				System.out.print("terceiro\n");
			}else if(x>0 && y<0){
				System.out.print("quarto\n");
			}else if(x==0 || y==0){
				aux = 0;
			}		
		}		
	}
}