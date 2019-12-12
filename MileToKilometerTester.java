package conversiondomain;

import java.util.Scanner;

public class MileToKilometerTester extends MilesConveter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates a scanner object
        System.out.println("Enter Mile in miles to convert to Kilometer"); // prompts user to input Temp
        double mile = scan.nextDouble(); // sets mile to a new value
        MilesConveter convert = new MilesConveter(); // creates new DistanceConversion object
        double kilometer = convert.mileToKilometer(mile);; // creates new kilometer variable
        System.out.println(mile + " miles is " + kilometer +"  km"); // prints final statement 
	}

}
