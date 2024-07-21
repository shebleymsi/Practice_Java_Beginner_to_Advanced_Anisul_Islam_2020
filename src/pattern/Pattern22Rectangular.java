

package pattern;

import java.util.Scanner;


public class Pattern22Rectangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n =  input.nextInt();
                
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
                if(row==1|| row==n|| col==1||col==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
                System.out.println("");
                
        }
            
    }
}
    