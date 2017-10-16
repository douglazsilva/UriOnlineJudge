package urionlinejudge;

//import java.text.DecimalFormat;
import java.util.Scanner;


public class AreaCirculo {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("#0.0000");
	   
	double raio = s.nextDouble();         
                
        double pi = 3.14159;
                
        double area = pi * (Math.pow(raio , 2));
        
        s.close();
                                
	System.out.printf("A=%.4f\n", area);
    }   
}
