
package oop_01.oop.overloading_Constractor;

public class Test {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        
        Teacher teacher2 = new Teacher("Shebley", "Male");
        teacher2.displayinformation();
        
        Teacher teacher3 = new Teacher("Msi", "Female", 720572577);
        teacher3.displayinformation();
    }
    
}
