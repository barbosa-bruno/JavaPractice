package ExerciseSetSatish;

import java.util.Scanner;

public class ForLoopTriangles {
    public static void main(String[] args) {

        //Write a program using nested loops to draw the following patters. The number of rows (height) should be input by the user.

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();


        //first triangle
        for (int i = 1; i <= rows; i++) {

            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //second triangle
        for (int i = rows; i >= 1; i--) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //third triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //fourth triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
