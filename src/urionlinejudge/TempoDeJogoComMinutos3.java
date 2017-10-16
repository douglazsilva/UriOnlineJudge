package urionlinejudge;

import java.util.Scanner;

public class TempoDeJogoComMinutos3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int horaIni,mintIni,horaFim,mintFim,hora,mint;

        horaIni = scanner.nextInt();
        mintIni = scanner.nextInt();
        horaFim = scanner.nextInt();
        mintFim = scanner.nextInt();

        if(horaIni==horaFim){
            hora = 24;
        }else if(horaIni<horaFim){
            hora = ((24-horaIni)+horaFim)-24;
        }else{
            hora = (horaFim-horaIni)+24;
        }
        if(mintIni==mintFim){
            mint = 0;
        }else if(mintIni<mintFim){
            mint = mintFim-mintIni;
            if(hora>=24 && mint>0){
                hora = 0;
            }
        }else{
            mint = (mintFim-mintIni)+60;
            if(hora>=24 && mint>0){
                hora--;
            }else if(hora==1){
                hora = 0;
            }
        }
        System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+mint+" MINUTO(S)");
    }
    
}
