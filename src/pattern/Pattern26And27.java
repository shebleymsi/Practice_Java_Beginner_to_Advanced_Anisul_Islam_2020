

package pattern;

import java.util.Scanner;

public class Pattern26And27 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();
        
            for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row ; col++) {
                System.out.print("  "); // 2 space
                }
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);//1 space
                }
            for (int col =row-1; col >=1; col--) {
                System.out.print(" "+col);//1 space
                }// 5.162 tutorial c programm
                System.out.println("");
        }
            for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <=n-row ; col++) {
                System.out.print("  "); // 2 space
                }
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);//1 space
                }
            for (int col =row-1; col >=1; col--) {
                System.out.print(" "+col);//1 space
                }
                System.out.println("");
        }
        
    }
    
}
