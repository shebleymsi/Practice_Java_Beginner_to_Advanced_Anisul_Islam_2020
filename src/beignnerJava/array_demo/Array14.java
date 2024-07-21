package beignnerJava.array_demo;

import java.util.Scanner;

public class Array14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        //Getting input for A matrix
        System.out.println("Enter element for matrix A ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A [%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }
        System.out.println();
        //Getting input for B matrix
        System.out.println("Enter element for matrix B ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B [%d][%d] = ", row, col);
                B[row][col] = input.nextInt();
            }
        }
        System.out.println();
        // Printing A matrix
        System.out.print("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        // Printing B matrix
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + B[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        // Addaing A and B matrix
        System.out.println("A+B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] + B[row][col];
                System.out.print("\t " + (C[row][col]));
            }
            System.out.println();
        }
    }

}
