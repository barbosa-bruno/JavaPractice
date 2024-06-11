package ExerciseSet2;

import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price ");
        double scItem = sc.nextDouble();  // Read user input

        double stateTax = scItem * 0.05;
        double countyTax = scItem * 0.025;
        double allTax = stateTax + countyTax;

        System.out.println("the price of the item is " + scItem);
        System.out.println("the state tax is " + stateTax);
        System.out.println("the county tax is " + countyTax);
        System.out.println("the entire tax amount is " + allTax);
        System.out.println("the total purchase price is " + (scItem + allTax));


    }
}
