import java.util.ArrayList;
import java.util.List;

public class Topic {

	private List<ISubscriber> subscribers;

	public Topic() {
		subscribers = new ArrayList<>();
	}

	public void addSubscriber(ISubscriber sub) {
		subscribers.add(sub);
	}

	public List<ISubscriber> getSubscribers() {
		return subscribers;
	}

	public void dispatchEvent(int choice, String input) {
		if (choice >= subscribers.size() || choice < 0)
			for (ISubscriber sub : this.getSubscribers())
				sub.notifySubscriberThreaded(input);

		else subscribers.get(choice).notifySubscriber(input);
	}
}
