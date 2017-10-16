package urionlinejudge;

import java.util.Scanner;

public class AumentoDeSalario {

     public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double salario = n.nextDouble();
        double reajuste;
        char p = '%';
        if(salario > 2000.00){
            reajuste = salario * 0.04;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual de: 4 %c\n", p);
        }else if((salario <= 2000.00) && (salario >= 1200.01)){
            reajuste = salario * 0.07;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual de: 7 %c\n", p);
        }else if((salario <= 1200.00) && (salario >= 800.01)){
            reajuste = salario * 0.10;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 10 %c\n", p);
        }else if((salario <= 800.00) && (salario >= 400.01)){
            reajuste = salario * 0.12;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 12 %c\n", p);
        }else if((salario <= 400.00) && (salario >= 0)){
            reajuste = salario * 0.15;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 15 %c\n", p);
        }
    }
    
}
