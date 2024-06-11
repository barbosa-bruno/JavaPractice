package ExerciseSetSatish;

public class TreadmillCalories {
    public static void main (String[] args) {

        //	Running on a particular treadmill you burn 4.2 calories per minute.
        //  Write a program that uses a loop to display the number of calories burned after 10, 15, 20, 25, and 30 minutes.

        double CPM = 4.2;
        int[] caloriesTime = {10, 15, 20, 25, 30};

        for (int minutes : caloriesTime) {
            double caloriesburnt = CPM * minutes;
            System.out.println("Calories burnt after " + minutes + " minutes: " + caloriesburnt);
        }


    }


}
