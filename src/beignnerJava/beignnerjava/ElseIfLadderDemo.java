
package beignnerJava.beignnerjava;

import java.util.Scanner;

public class ElseIfLadderDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter integer number = ");
        number = input.nextInt();
        
        if(number>0){
            System.out.println("Positive");
        }
        else if (number<0){
        System.out.println("Negative");
        }
        else{
            System.out.println("Equal to zero");
        }
    }
    
}
