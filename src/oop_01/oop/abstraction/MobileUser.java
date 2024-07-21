package oop_01.oop.abstraction;

public abstract class MobileUser {
    
    void call(){  // non abstract method
        System.out.println("Call method");
    }

    abstract void sendMessage(); // abstract method

}

// abstract and non abstract both of exist so its not fully abstract