package conversiondomain;

import java.util.Scanner;

public class KilometerToMileTester extends KilometerToMilesConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates a scanner object
        System.out.println("Enter Mile in miles to convert to Kilometer"); // prompts user to input Temp
        double kilometer = scan.nextDouble(); // sets kilometer to a new value
        KilometerToMilesConverter convert = new KilometerToMilesConverter(); // creates new DistanceConversion object
        double mile = convert.kelometerToMile(kilometer);; // creates new mile variable
        System.out.println(kilometer + " miles is " + mile +"  km"); // prints final statement 
	}

}
