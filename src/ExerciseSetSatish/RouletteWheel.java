package ExerciseSet2;

import java.util.Scanner;

public class RouletteWheel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter an number ");
        int num = sc.nextInt();


        while(num < 0 || num > 36) {
            System.out.println("invalid number. try again");

            System.out.print("enter an number ");
            num = sc.nextInt();
        }

        if(num == 0) {
            System.out.println("Pocket 0 is green");
        }
        else if(num >= 1 && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("Pocket " + num + " is black");
            }
            else{
                System.out.println("Pocket " + num + " is red");
            }
        }
        else if(num >= 11 && num <= 18) {
            if (num % 2 == 0) {
                System.out.println("Pocket " + num + " is red");
            }
            else {
                System.out.println("Pocket " + num + " is black");
            }
        }

        else if(num >= 19 && num <= 28) {
            if (num % 2 == 0) {
                System.out.println("Pocket " + num + " is black");
            }
            else {
                System.out.println("Pocket " + num + " is red");
            }
        }
        // 29 to 36
        else if(num >= 29 && num <= 36) {
            if (num % 2 == 0) {
                System.out.println("Pocket " + num + " is red");
            }
            else{
                System.out.println("Pocket " + num + " is black");
            }
        }
    }
}
