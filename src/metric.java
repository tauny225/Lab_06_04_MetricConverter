
import java.util.Scanner;

public class metric {

    public static <string> void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double meters = 0;
        double miles;
        double feet;
        double inches;
        String trash = "";

        System.out.print("Enter a measurement in meters: ");
        if(in.hasNextDouble())
        {
            meters= in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("The number you entered is invalid: " + trash);
        }

        miles = meters * 0.000621371;
        feet = meters * 3.28084;
        inches = meters * 39.3701;

        System.out.println("The measurement in miles is: " + miles);
        System.out.println("The measurement in feet is: " + feet);
        System.out.println("The measurement in inches is: " + inches);

	// write your code here
    }
}
