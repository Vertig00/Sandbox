package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class News extends SplSubject{

	private List<Observers> observers = new ArrayList<Observers>();

	public void attachObserver(Observers observer) {
		observers.add(observer);
	}

	public void detachObserver(Observers observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observers observer : observers) {
			observer.update(this);
		}
	}

	public void addNews(String desc) {
		System.out.println("Treść newsa: " + desc);
		notifyObservers();
	}

}
