import java.util.Scanner;

public class PUM{
	
	public static void main(String[] args){	
		
		int v1, v2, v3, v4, aux = 1;
		
		Scanner s = new Scanner(System.in);		
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++){		
			v1 = aux;
			v2 = v1+1;
			v3 = v2+1;
			v4 = v3+1;
			System.out.println(v1 + " " + v2 + " " + v3 + " " + "PUM");
			aux = v4 + 1;				
		}
	}
}