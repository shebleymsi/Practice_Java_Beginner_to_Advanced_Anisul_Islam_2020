
package oop_01.oop.decimal_number_formatting;

import java.text.DecimalFormat;

public class DecimalNumberFormatting {
    
    public static void main(String[] args) {
        
        DecimalFormat ob = new DecimalFormat("0.000");
        double x = 2.4793456;
        System.out.println("x = "+ob.format(x));
        
    /*  double x = 2.4793;
        System.out.printf("x = %.3f",x);  */

        
        
    }
    
}
