package patterns.decorator;

public class TestDecorator {

	public static void main(String[] args) {

		System.out.println("Bez dekoratora");
		withoutDecorator();

		System.out.println();

		System.out.println("Z dekoratorem");
		withDecorator();

	}

	public static void withoutDecorator() {
		Service service = new News();
		service.doAction();
	}

	public static void withDecorator() {
		Service service = new ServiceDecorator(new News());
		service.doAction();
	}


}
