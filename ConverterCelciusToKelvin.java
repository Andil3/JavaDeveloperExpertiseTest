package conversiondomain;

public class ConverterCelciusToKelvin {
	 private double celsius;
	    public void TempConversion()
	    {
	    	setCelsius(0);
	    }
	    
	     public double celsiusToKelvin(double celsius)
	     {
	         double kelvin =  celsius + 273;
	         return kelvin;
	    }

		public double getCelsius() {
			return celsius;
		}

		public void setCelsius(double celsius) {
			this.celsius = celsius;
		}
}
