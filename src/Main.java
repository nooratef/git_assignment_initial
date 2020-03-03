import java.util.Scanner;

public class Main {
  
	private static ISubscriber[] subscribers = {
			new CircleAreaCalculator(),
			new CircleVolume(),
			new Fibonacci(),
			new LucasSeries(),
			new SphereArea(),
			new SphereCircumference(),
			new SphereVolume(),
			new SummationSeries()
	};

	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Math Functions Calculator..");
		while (true) {
			System.out.println("\n0- Exit\n1- Circle Area Calculator\n2- Circle Volume\n3- Fibonacci\n4- Lucas Series\n5- Sphere Area" +
					"\n6- Sphere Circumference\n7- Sphere Volume\n8- Summation Series\n10- Run All\n** Any other input will terminate.");
			try {
				int choice = sc.nextInt();

				if (choice < 0 || choice > 10) throw new Exception("Invalid parameter number");
				if (choice == 0) break;

				System.out.print("Enter the parameter: ");
				String input = sc.next();

				mathTopic.dispatchEvent(choice-1, input);
			}
			catch (Exception e){
				System.out.println("Error program will terminate");
				System.out.println(e.getMessage());
				break;
			}
		}
	}
}
