package ExerciseSetSatish;

import java.util.Scanner;

public class NegativePositiveLoop {
    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number to add. do a negative to fall out the loop : ");
        int number = sc.nextInt();


        while (number > 0) {
            sum += number;
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        }
        if (number < 0) {
            System.out.println("You input a negative number. the total positive number is: " + sum);
        }
    }
}