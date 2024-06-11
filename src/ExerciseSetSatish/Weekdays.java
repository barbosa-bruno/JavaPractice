package ExerciseSet2;

import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number 1-7");
        int weekday = sc.nextInt();


        while (weekday < 1 || weekday > 7) {
            System.out.println("invalid input");
            System.out.println("enter a number 1-7");
            weekday = sc.nextInt();
        }

        switch (weekday) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }
    }
}
