package urionlinejudge;

import java.util.Scanner;

public class NotasEMoedas3 {

    public static void main(String[] args) {
        
              int X, Y;

        Scanner sc = new Scanner(System.in);
        try {
            double fullvalue = sc.nextDouble();

            System.out.printf("NOTAS:\n");

            int hun = 0;
            int fi = 0;
            int tw = 0;
            int ten = 0;
            int five = 0;
            int two = 0;
            int one = 0;
            int half = 0;
            int oneQ = 0;
            int oneD = 0;
            int onehalfD = 0;
            int onecent = 0;

            String v = String.format("%.2f", fullvalue);
            int c = Integer.parseInt(v.substring(v.length()-2, v.length()));

            int value = Math.round(Float.parseFloat(v.substring(0, v.length()-2)));

            while (fullvalue != -1){
                if(value/100 >= 1)
                    hun = value/100; value -= hun*100;
                if(value/50 >= 1)
                    fi = value/50; value -= fi*50;
                if(value/20 >= 1)
                    tw = value/20; value -= tw*20;
                if(value/10 >= 1)
                    ten = value/10; value -= ten*10;
                if(value/5 >= 1)
                    five = value/5; value -= five*5;
                if(value/2 >= 1)
                    two = value/2; value -= two*2;

                value = value*100 + (c);

                if(value/100 >= 1)
                    one = value/100; value -= one*100;
                if(value/50 >= 1)
                    half = value/50; value -= half*50;
                if(value/25 >= 1)
                    oneQ = value/25; value -= oneQ*25;
                if(value/10 >= 1)
                    oneD = value/10; value -= oneD*10;
                if(value/5 >= 1)
                    onehalfD = value/5; onehalfD -= onehalfD*5;

                    onecent = value; fullvalue =-1;
            }

            System.out.printf("%s nota(s) de R$ 100.00\n", hun);
            System.out.printf("%s nota(s) de R$ 50.00\n", fi);
            System.out.printf("%s nota(s) de R$ 20.00\n", tw);
            System.out.printf("%s nota(s) de R$ 10.00\n", ten);
            System.out.printf("%s nota(s) de R$ 5.00\n", five);
            System.out.printf("%s nota(s) de R$ 2.00\n", two);

            System.out.printf("MOEDAS:\n");

            System.out.printf("%s moeda(s) de R$ 1.00\n", one);
            System.out.printf("%s moeda(s) de R$ 0.50\n", half);
            System.out.printf("%s moeda(s) de R$ 0.25\n", oneQ);
            System.out.printf("%s moeda(s) de R$ 0.10\n", oneD);
            System.out.printf("%s moeda(s) de R$ 0.05\n", onehalfD);
            System.out.printf("%s moeda(s) de R$ 0.01\n", onecent);
        } catch(Exception ex){
            System.err.print("Presentation Error");
        }
    }
    
}
