package oop_01.oop.method_to_string_not_normal_2;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("\n");
    }
       

}
