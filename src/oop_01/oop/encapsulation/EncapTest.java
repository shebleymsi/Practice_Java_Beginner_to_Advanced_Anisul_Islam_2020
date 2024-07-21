package oop_01.oop.encapsulation;

public class EncapTest {

    public static void main(String[] args) {

        Person p1 = new Person();
       /* p1.name = "Msi";
        p1.age = 35;
        p1.display(); */
       
       p1.setName("Msi");
       p1.setAge(35);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
