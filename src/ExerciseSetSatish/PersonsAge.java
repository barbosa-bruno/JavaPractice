package ExerciseSet2;

import java.util.Scanner;

public class PersonsAge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter an age ");
        int age = sc.nextInt();

        if(age == 1 || age == 0) {
            System.out.println("they are an infant");
        }
        else if (age > 1 && age < 12) {
            System.out.println("they are a child");
        }
        else if (age > 13 && age < 19) {
            System.out.println("they are a teenager");
        }
        else {
            System.out.println("they are an adult");
        }








    }
}
