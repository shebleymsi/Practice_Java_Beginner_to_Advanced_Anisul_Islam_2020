
package oop_01.oop.this_keyword_2;

public class Person {
    
    
    void message(){
        System.out.println("I am message method");
    }
    
    void display(){
        message(); // compiler mean "this"
        System.out.println("I am display method");
    }
              
    
}
