
package beignnerJava.beignnerjava;

import java.util.Scanner;


public class SeriesMulti1 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result=1;
        System.out.print("Enter final number = ");
        n = input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            
            result = result*i;
            System.out.print(i+" ");
            
        }
        System.out.println(" ");
        System.out.println("result  "+result);
    }
    
    
}
