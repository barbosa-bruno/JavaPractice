package PythonProblems;

import java.util.Scanner;

public class BMICalc {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("weight? ");
        double w = sc.nextDouble();

        System.out.print("height? ");
        double h = sc.nextDouble();

        double bmi = (w * (703/(h*h)));
                //weight x 703/height^2


        if(bmi < 18.5 && bmi > 25) {
            System.out.println("bmi is optimal at " + bmi);
        }
        else if(bmi < 18.5) {
            System.out.println("bmi is underweight " + bmi);
        }
        else if (bmi > 25){
            System.out.println("bmi is overweight " + bmi);
        }

    }
}
