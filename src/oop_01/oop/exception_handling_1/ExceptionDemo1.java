package oop_01.oop.exception_handling_1;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e1) {
            System.out.println("Exception : " + e1);
        } catch (Exception e2) {
            System.out.println("Exception : " + e2);
        } finally {
            System.out.println("Last line of the Programme");
        }
    }
}
