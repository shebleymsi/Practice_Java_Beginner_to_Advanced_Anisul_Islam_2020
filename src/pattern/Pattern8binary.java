
package pattern;

import java.util.Scanner;


public class Pattern8binary {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line number : ");
        int n = input.nextInt();
        
        for (int row =1 ; row <= n; row++) {
             for (int col = 1 ; col <=row ; col++) {
                 System.out.print(col%2);
            }
            System.out.println("");
        }
        
    }   
    
}
