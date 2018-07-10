package patterns.observer;

public class TestObserver {

	public static void main(String[] args) {
		News news = new News();

		news.attachObserver(new RSSObserver());
		news.attachObserver(new NewsletterObserver());

		news.addNews("Testujemy mechanizm Obserwatora");
	}

}
