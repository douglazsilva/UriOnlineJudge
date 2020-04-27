import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
				
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();	
		
		while(n != 0){
			String str = "";			
			for(int i = 0; i < n; i++){
				if( i != (n-1)){
					str += "" + (i+1) + " ";
				} else {
					str += "" + (i+1);
				}
			}
			System.out.println(str);
			n = input.nextInt();
		}
	}
}