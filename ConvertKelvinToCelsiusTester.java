package conversiondomain;

import java.util.Scanner;

public class ConvertKelvinToCelsiusTester extends ConvertKelvinToCelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates a scanner object
        System.out.println("Enter Temp in Kelvin to convert to Celsius"); // prompts user to input Temp
        double kelvin = scan.nextDouble(); // sets fahrenheit to a new value
        ConverterCelciusToKelvin convert = new ConverterCelciusToKelvin(); // creates new TempConversion object
        double celsius = convert.celsiusToKelvin(kelvin);; // creates new kelvin variable
        System.out.println(kelvin + " degrees kelvin is " + celsius +" degrees in celsius"); // prints final statement 
	}

}
