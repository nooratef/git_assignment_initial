
public interface ISubscriber {
	default void notifySubscriberThreaded(String input){
		new Thread(() -> notifySubscriber(input)).start();
	}
	void notifySubscriber(String input);
}