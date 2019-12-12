package conversiondomain;
import java.util.Scanner;
public class ConvertCelsiusToKelvinTester extends ConverterCelciusToKelvin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // creates a scanner object
        System.out.println("Enter Temp in Celsius to convert to Kelvin"); // prompts user to input Temp
        double calsius = scan.nextDouble(); // sets fahrenheit to a new value
        ConverterCelciusToKelvin convert = new ConverterCelciusToKelvin(); // creates new TempConversion object
        double kelvin = convert.celsiusToKelvin(calsius);; // creates new kelvin variable
        System.out.println(calsius + " degrees calsius is " + kelvin +" degrees in kelvin"); // prints final statement 
        
    }
}