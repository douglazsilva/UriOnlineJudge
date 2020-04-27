import java.util.Scanner;

public class SequenciaLogica2{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		int c1 = 1;
		int c2 = 0;
		
		if((1 < X) && (X < 20) && (Y < 100000)){
			for(c1 = 1; c1 <= Y; c1++){
				c2++;
				if(c2 == X){
					System.out.printf("%d\n", c1);
					c2 = 0;
				} else {
					System.out.printf("%d ", c1);
				}
			}
		}		
	}
}