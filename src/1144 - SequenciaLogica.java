import java.util.Scanner;

public class SequenciaLogica{
	
	public static void main(String[] args){	
		
		int v1, v2, v3;
		
		Scanner s = new Scanner(System.in);		
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++){
			v1 = i + 1;
			v2 = v1 * v1;
			v3 = v1 * v2;
			System.out.print(v1 + " " + v2 + " " + v3 + "\n");
			System.out.print(v1 + " " + (v2+1) + " " + (v3+1) + "\n");
		}
	}
}