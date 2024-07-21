package oop_01.oop.static_block;

public class StaticBlockDemo {

  static int id;
    static String name;

    static {
        id = 1654;
        name = "Shebley";
    }

    static void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        StaticBlockDemo.display();
    }   
    
 /*   static{
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }  */
}
