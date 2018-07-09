package patterns.singleton;


/**
 * Obejmuje synchronizację, wywoływana przy pierwszym wywołaniu metody.
 * Jeżeli dwa wątki równocześnie wywołają metodę getInstance i pierwszy warunek (instance == null) zostanie spełniony przez nie oba,
 * to w kolejnej linii (synchronized (DoubleBlockSingleton.class)) dostęp do ponownego sprawdzenia warunku (instance == null)
 * zostanie zsynchronizowany.
 * */
public class DoubleBlockSingleton {

	private volatile static DoubleBlockSingleton instance;

	public DoubleBlockSingleton() {}

	public static DoubleBlockSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleBlockSingleton.class) {
				if (instance == null) {
					instance = new DoubleBlockSingleton();
				}
			}
		}
		return instance;
	}

}
