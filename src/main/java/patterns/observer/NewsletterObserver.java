package patterns.observer;

public class NewsletterObserver implements Observers {


	public void update(SplSubject subject) {
		System.out.println("Aktualizuje newsletter");
	}
}
