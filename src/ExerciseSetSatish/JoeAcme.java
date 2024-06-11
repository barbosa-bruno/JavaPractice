package ExerciseSet2;


public class JoeAcme {
    public static void main(String[] args) {


        double preStock = 2000 * 40.00;
        double bfBroker = preStock * 0.03;
        double postStock = 42.75 * 2000;
        double bfbBroker = postStock * 0.03;
        double end = postStock - preStock;
        double endend = end - bfbBroker;

        System.out.println("Joe purchased 2,000 shares");
        System.out.println("When Joe purchased the stock, he paid $40.00 per share");
        System.out.println("Joe paid his stockbroker a commission that amounted to 3 percent of the amount he paid for the stock");
        System.out.println(" ");

        System.out.println("Two weeks later, Joe sold the stock. Here are the details of the sale: ");
        System.out.println("The number of shares that Joe sold was 2,000.");
        System.out.println("He sold the stock for $42.75 per share.");
        System.out.println("He paid his stockbroker another commission that amounted to 3 percent of the amount he received for the stock.");
        System.out.println(" ");

        System.out.println("The amount that Joe paid the stock for was " + preStock);
        System.out.println("joe paid his broker " + bfBroker);
        System.out.println("joe sold his stock for " + postStock);
        System.out.println("joe paid his broker after " + bfbBroker);

        System.out.println("he made this amount back: " + endend);

    }
}
