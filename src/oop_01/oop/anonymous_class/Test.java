package oop_01.oop.anonymous_class;

public class Test {

    public static void main(String[] args) {

        Person p = new Person() {

            @Override
            void display() {
                System.out.println("Person class");
            }
        };
        p.display();

    }

}
