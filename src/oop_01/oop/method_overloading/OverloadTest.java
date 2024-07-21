
package oop_01.oop.method_overloading;

public class OverloadTest {
    public static void main(String[] args) {
        
        MethodOverloading ob = new  MethodOverloading();
        ob.add(2, 3);
        ob.add(2.2, 3.3);
        ob.add(2, 3, 4);
        ob.add();
        
    }
    
}
