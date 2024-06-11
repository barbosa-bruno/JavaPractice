package ExerciseSetSatish;

import java.util.Scanner;

public class MathQuizzes {
    public static void main(String[] args) {
        double a = Math.floor(Math.random() * 100);
        double b = Math.floor(Math.random() * 100);
        double finalanswer = a + b;

        System.out.println("add the numbers " + a + " + " + b );

        Scanner sc = new Scanner(System.in);
        System.out.print("My guess is: ");
        double answer = sc.nextDouble();


        if(answer == finalanswer) {
            System.out.println("Good job! You're right! ");
        }
        else {
            System.out.println("Good job! You're wrong! ");
        }
    }
}
