package oop_01.oop.method_to_String_1;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nAge : " + age;

    }
}
