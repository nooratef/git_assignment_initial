public class summationSeries implements ISubscriber{
     
	public void notifySubscriber(String input) 
	{
		double sum = 0;
		double counter = Double.valueOf(input);

		for(double i=0 ; i<=counter ; i++){ //only for count number of series element
			 sum += i ;
			 }
		System.out.println("series summation = " + sum );
	}
}
