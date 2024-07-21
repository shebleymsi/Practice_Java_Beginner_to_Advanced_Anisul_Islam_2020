package oop_01.oop.polymorphism_2_problem;

public class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        System.out.print("Area for Triangle : ");
        return .5 * base * height;
    }

}
