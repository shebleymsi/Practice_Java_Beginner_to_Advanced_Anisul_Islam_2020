
package oop_01.oop.inheritance;

public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Msi";
        t1.age = 35;
        t1.qualification = "Msc in math";
        t1.displayInformation2();
        
        Teacher t2 = new Teacher();
        t2.name = "Shahadul";
        t2.age = 30;
        t2.qualification = "Msc in math";
        t2.displayInformation2();
    }
    
}
