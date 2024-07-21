package oop_01.oop.exception_handling_1;

public class ExceptionDemo2 {

    public static void main(String[] args) {

        try {
            int[] a = new int[4];
            a[4] = 10;
        } catch (ArithmeticException e1) {
            System.out.println("Exception : " + e1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Exception : " + e2);
        }
    }

}
