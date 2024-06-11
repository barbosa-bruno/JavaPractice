package W3Resources;

import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {

/*


17. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101

18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110

19. Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

20. Write a Java program to convert a decimal number to a hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F



Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an integer ");
        int number = sc.nextInt();


        int sum = calculateSumOfDigits(number);

        System.out.println("Sum of digits: " + sum);

    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {

            sum += number % 10; // Add the last digit to the sum
            number /= 10;
        }
        return sum;

    }


}
