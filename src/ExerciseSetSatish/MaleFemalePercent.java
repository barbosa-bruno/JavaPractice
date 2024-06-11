package ExerciseSet2;
import java.util.Scanner;

public class MaleFemalePercent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("how many males ");
        int scMale = sc.nextInt();  // Read user input

        System.out.print("how many females ");
        int scFemale = sc.nextInt();  // Read user input

        double totalPeople = scMale + scFemale;

        System.out.println("the amount of males is " + (scMale / totalPeople * 100));
        System.out.println("the amount of females is " + (scFemale / totalPeople) * 100);


    }
}
