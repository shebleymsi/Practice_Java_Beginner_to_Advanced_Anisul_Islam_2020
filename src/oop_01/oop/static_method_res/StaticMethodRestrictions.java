package oop_01.oop.static_method_res;

public class StaticMethodRestrictions {
    
    static int x = 10;
    
    void display1(){
        System.out.println("I am non static method");
    }
    static void display2(){
        System.out.println("i am static method");
        System.out.println(""+x);
    }
    
}
