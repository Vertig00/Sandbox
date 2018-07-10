package patterns.facade;

public class Product {

	public void getName(Long id) {
		System.out.println("Produkt: " + id);
	}

	public void getAllProducts() {
		System.out.println("Lista produktów");
	}

}
