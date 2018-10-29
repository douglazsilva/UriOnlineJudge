package urionlinejudge;

import java.util.Scanner;

public class Media3 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        float N1 = n.nextFloat();       
        float N2 = n.nextFloat();        
        float N3 = n.nextFloat();
        float N4 = n.nextFloat();

        double m1 , m2;
        
        m1 = ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4) / 10;
        System.out.printf("Media: %.1f\n" , m1);
        
        if (m1 >= 7){
            System.out.printf("Aluno aprovado.\n");        
        } else if(m1 < 5){
            System.out.printf("Aluno reprovado.\n");        
        }else {
            System.out.printf("Aluno em exame.\n");
            float NE = n.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", NE);
            m2 = (m1 + NE)/2;
            if (m2 >= 5){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n" , m2);
            }else {
                System.out.printf("Aluno reprovado.\n");                
            }
            
        }
    }
    
}
