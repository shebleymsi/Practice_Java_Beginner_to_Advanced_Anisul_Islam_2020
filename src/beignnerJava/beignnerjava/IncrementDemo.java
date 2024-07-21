
package beignnerJava.beignnerjava;


public class IncrementDemo {
    public static void main(String[] args) {
        
        int x = 0 ;
        int y ;
        
        y = x++; //Post increment
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
        
        y = ++x; //Pre increment
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
        
        y = x--; //Post Decrement
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
        
        y =--x; //Pre Decrement
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
        
        
    }
    
}
