
package pattern;

import java.util.Scanner;


public class Pattern11AlphabetReverse {
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line number : ");
        int n = input.nextInt();
        
        for (int row =1 ; row <= n; row++) {
             for (int col = 1 ; col <=row ; col++) {
                 System.out.print(" "+row);
            }
            System.out.println("");
        }

        for (int row =n-1 ; row >= 1; row--) {
             for (int col = 1 ; col <=row ; col++) {
                 System.out.print(" "+row);
            }
            System.out.println("");
        }
    
    }
    
}
