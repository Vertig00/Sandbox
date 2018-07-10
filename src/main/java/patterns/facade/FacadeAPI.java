package patterns.facade;

public class FacadeAPI {

	private Cart cart;

	private Product product;

	public FacadeAPI(Cart cart, Product product) {
		this.cart = cart;
		this.product = product;
	}

	public void getCartList() {
		cart.getItems();
	}

	public void getProductByID(Long id) {
		product.getName(id);
	}

	public void getAllProducts() {
		product.getAllProducts();
	}

}
