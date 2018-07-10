package patterns.observer;

public class RSSObserver implements Observers {

	public void update(SplSubject subject) {
		System.out.println("Aktualizuje RSS");
	}
}
