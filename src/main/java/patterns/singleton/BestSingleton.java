package patterns.singleton;


/**
 * Singleton z prywatną klasa statyczną, najlepsza implementacja.
 * */
public class BestSingleton {

	public BestSingleton() {}

	public static BestSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder {
		private static final BestSingleton INSTANCE = new BestSingleton();
	}
}
