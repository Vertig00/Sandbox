package patterns.decorator;

public class ServiceDecorator implements Service{

	private Service service;

	public ServiceDecorator(Service service) {
		this.service = service;
	}

	public void doAction() {
		additionalAction();
		service.doAction();
	}

	private void additionalAction() {
		System.out.println("Dodatkowe działanie funkcji");
	}

}
