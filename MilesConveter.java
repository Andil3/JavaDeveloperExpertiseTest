package conversiondomain;

public class MilesConveter {
	 private double mile;
	    public void DistanceConversion()
	    {
	      setMile(0);
	    }
	    
	     public double mileToKilometer(double mile)
	     {
	         double kilometer =  mile *1.60934;
	         return kilometer;
	    }

		public double getMile() {
			return mile;
		}

		public void setMile(double mile) {
			this.mile = mile;
		}
}
