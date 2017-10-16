package urionlinejudge;

import java.util.Scanner;

public class TempoDejogoComMinutos2 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int hi, mi, hf, mf;
        int h, m;
        
        hi = n.nextInt();
        mi = n.nextInt();
        hf = n.nextInt();
        mf = n.nextInt();
        
        if(hi == hf){
            if (mi < mf){
            h = 0;
            m = mf - mi;
            }else if(mi > mf){
                h = 23;
                m = 60 - (mi - mf);
            }else{
                h = 24;
                m = 0;
            }
        }else if(hi < hf){
            h = hf - hi;
            if(mi > mf){
                m = mi - mf;
                if((mi - mf) == 1){
                    h = 0;
                    m = 59;
                }else if((hf - hi) == 2){
                    h = 1;
                    m = 60 - m;
                }            
            }else if(mi < mf){
                m = mf - mi;
            }else{
                m = 0;
            }        
        }else{
            h = 24 - (hi - hf);
            if((hi - hf) == 1 && mi > mf){
                h = 22;
                m = 60 - (mi - mf);
            }else if(mi > mf){
                if(mf == 0){
                    m = mi;
                }else if(mi <= 30 && mf <=30){
                m = mi - mf;
                }else{
                m = 60 - (mi - mf);
                }
            }else if(mi < mf){
                m = mf - mi;
            }else{
                m = 0;
                h = 23;
            }            
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", h, m);        
    }
    
}
