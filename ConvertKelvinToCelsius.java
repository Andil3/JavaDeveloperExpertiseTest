package conversiondomain;

public class ConvertKelvinToCelsius {
	 private double kelvin;
	    public void TempConversion()
	    {
	      setKelvin(0);
	    }
	    
	     public double kelvinToCelsius(double kelvin)
	     {
	         double celsius =  kelvin -273.15;
	         return celsius;
	    }

		public double getKelvin() {
			return kelvin;
		}

		public void setKelvin(double kelvin) {
			this.kelvin = kelvin;
		}
}
