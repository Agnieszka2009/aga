
import java.util.Scanner;


public class ejercicio2 {
   public static void main(String[] args){
      Scanner keyboard = new Scanner (System.in);
    
             System.out.println ("1.- Como te llamas?");
             String pregunta1 = keyboard.next();
             
             System.out.println ("1.- Cuanto pesas?");
             int pregunta2 = keyboard.nextInt();
             
             System.out.println ("1.- Eres socio?");
             String pregunta3 = keyboard.next();
             
       
        if (pregunta3.equals("si")) {
            System.out.println("Bienvenido socio " + pregunta1 + " pesas " + pregunta2 + " kg ");
            
        } else {
           System.out.println( "no eres socio");
        }}}
            
            
        
   

 