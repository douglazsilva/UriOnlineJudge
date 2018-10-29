package urionlinejudge;

import java.util.Scanner;


public class GastoCombustivel {


    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double kml = 12;
        int horas = n.nextInt();
        int velocidade = n.nextInt();
        
        double litros = horas * velocidade / kml;
        
        System.out.printf("%.3f\n", litros);
    }
    
}
