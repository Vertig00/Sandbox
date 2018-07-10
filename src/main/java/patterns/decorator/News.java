package patterns.decorator;

public class News implements Service{
	public void doAction() {
		System.out.println("Wywołanie funkcji z poziomu klasy " + this.getClass().getSimpleName());
	}
}
