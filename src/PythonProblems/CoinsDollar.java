package PythonProblems;

import java.util.Scanner;

public class CoinsDollar {
    public static void main(String[] args) {

        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double halfDollar = 0.50;

        Scanner sc = new Scanner(System.in);
        System.out.print("how many pennies? ");
        double p = sc.nextDouble();

        System.out.print("how many nickels? ");
        double n = sc.nextDouble();

        System.out.print("how many dimes? ");
        double d = sc.nextDouble();

        System.out.print("how many quarters? ");
        double q = sc.nextDouble();

        System.out.print("how many half dollars? ");
        double hd = sc.nextDouble();


        System.out.print("you chose " + p + " pennies");
        System.out.print("you chose " + n + " nickels");
        System.out.print("you chose " + d + " dimes");
        System.out.print("you chose " + q + " quarters");
        System.out.print("you chose " + hd + "half dollars");

        double total = (p*penny) + (n*nickel) + (d*dime) + (q*quarter) + (hd*halfDollar);
        System.out.println(total);

        if(total == 1.00) {
            System.out.print(" it equals a dollar!");
        }
        else {
            System.out.print("you lose! does not equate to be a dollar!");
        }

    }
}
