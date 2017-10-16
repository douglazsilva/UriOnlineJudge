/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge;

import java.util.Scanner;

/**
 *
 * @author Dougla'z
 */
public class Coord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner e = new Scanner (System.in);
          float x = e.nextFloat();
          float y = e.nextFloat();
          if (x > 0 && y > 0){
               System.out.println("Q1");
          }
          if (x < 0 && y > 0){
              System.out.println("Q2");
          }
          if (x < 0 && y < 0){
              System.out.println("Q3");
          }
          if (x > 0 && y < 0){
              System.out.println("Q4");
          }
          if(x == 0 && y != 0 ){
           System.out.println("Eixo Y"); 
          }
          if(x != 0 && y == 0 ){
           System.out.println("Eixo X"); 
          }
          if (x == 0 && y == 0){
          System.out.println("Origem");
          }
    }
    
}
