
public class CircleArea  implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		try {
			double r = Double.parseDouble(input);
			if(r >= 0)	
				System.out.println("The circle with radius = " + r + " , has area = " + (r*r*3.14));
			else	System.out.println("Error , radius can't have negative value");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
