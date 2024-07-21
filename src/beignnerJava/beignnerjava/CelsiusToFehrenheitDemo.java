
package beignnerJava.beignnerjava;

import java.util.Scanner;


public class CelsiusToFehrenheitDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double celsius, Fehrenheit ;
        
        System.out.print("Enter Celsius = ");
        celsius = input.nextDouble();
        
        Fehrenheit = 1.8 * celsius + 32;
        System.out.println("Fehrenheit = "+Fehrenheit);
        
        
    }

    
}
