import java.util.Scanner;
 
public class Animal {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        
        String p1 = s.nextLine();
        String p2 = s.nextLine();
        String p3 = s.nextLine();
        
        if ((p1.equals("vertebrado")) && (p2.equals("ave")) && (p3.equals("carnivoro"))) { 
            System.out.println("aguia");        
        }
        
        if ((p1.equals("vertebrado")) && (p2.equals("ave")) && (p3.equals("onivoro"))) { 
            System.out.println("pomba");        
        }
        
        if ((p1.equals("vertebrado")) && (p2.equals("mamifero")) && (p3.equals("onivoro"))) { 
            System.out.println("homem");        
        }
        
        if ((p1.equals("vertebrado")) && (p2.equals("mamifero")) && (p3.equals("herbivoro"))) { 
            System.out.println("vaca");        
        }
        
        if ((p1.equals("invertebrado")) && (p2.equals("inseto")) && (p3.equals("hematofago"))) { 
            System.out.println("pulga");        
        }
        
        if ((p1.equals("invertebrado")) && (p2.equals("inseto")) && (p3.equals("herbivoro"))) { 
            System.out.println("lagarta");            
        }
        
        if ((p1.equals("invertebrado")) && (p2.equals("anelideo")) && (p3.equals("hematofago"))) { 
            System.out.println("sanguessuga");            
        }
        
        if ((p1.equals("invertebrado")) && (p2.equals("anelideo")) && (p3.equals("onivoro"))) { 
            System.out.println("minhoca");            
        } 
    } 
}