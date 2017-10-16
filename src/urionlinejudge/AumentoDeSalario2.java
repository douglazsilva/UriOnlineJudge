package urionlinejudge;

import java.util.Scanner;

public class AumentoDeSalario2 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double salario = n.nextDouble();
        double reajuste, novoSalario;
        char p = '%';
                   
        if(salario >=0 && salario <= 400){
            novoSalario = salario * 1.15;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 15 %c\n", p);
        }
        if(salario >=400.01 && salario <= 800){
            novoSalario = salario * 1.12;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 12 %c\n", p);
        }
        if(salario >=800.01 && salario <= 1200){
            novoSalario = salario * 1.1;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 10 %c\n", p);
        }
        if(salario >=1200.01 && salario <= 2000){
            novoSalario = salario * 1.07;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 7 %c\n", p);
        }
        if(salario > 2000){
            novoSalario = salario * 1.04;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 4 %c\n", p);
        }
    }
    
}
