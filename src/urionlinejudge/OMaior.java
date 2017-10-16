package urionlinejudge;


import java.util.Scanner;

public class OMaior {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int a = n.nextInt();        
        int b = n.nextInt();        
        int c = n.nextInt();
        
        int maiorABC = (a + b + Math.abs(a - b))/ 2;
        maiorABC = (maiorABC + c + Math.abs(maiorABC - c))/2;
                
        System.out.println(maiorABC + " eh o maior");
        
    }
    
}
