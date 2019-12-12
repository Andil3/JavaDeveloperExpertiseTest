package conversiondomain;

public class KilometerToMilesConverter {
	 private double kilometer;
	    public void DistanceConversion()
	    {
	      setKilometer(0);
	    }
	    
	     public double kelometerToMile(double kilometer)
	     {
	         double mile =  kilometer *0.621371;
	         return mile;
	    }

		public double getKilometer() {
			return kilometer;
		}

		public void setKilometer(double kilometer) {
			this.kilometer = kilometer;
		}
}
