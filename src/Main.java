import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {

			new SphereArea(), new LucasSeries(),
    new CircleArea() , new SphereCircumference () ,
			new Spherevolume(), new summationSeries()
      , new Fibonacci() , new MultiplicationSeries (), new CircleVolum()

	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
