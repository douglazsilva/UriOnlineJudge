import java.util.Scanner;

public class MultiplosDe13{
	public static void main(String[] args){		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int tot = 0;
		
		if(x > y) {
			for(int i = y; i <= x; i++){
				if(i % 13 != 0){
					tot += i;
				}
			}
		} else if(x < y){
			for(int i = x; i <= y; i++){
				if(i % 13 != 0){
					tot += i;
				}
			}
		}		
		System.out.println(tot);
	}
}