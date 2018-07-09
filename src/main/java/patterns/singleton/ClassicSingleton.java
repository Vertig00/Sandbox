package patterns.singleton;

/**
 * Stanardowa implementacja, nie obejmuje wielowątkowości jest słaba
 *
 * */
public class ClassicSingleton {

	private static ClassicSingleton instance;

	public ClassicSingleton() {	}

	public static ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}

		return instance;
	}
}
