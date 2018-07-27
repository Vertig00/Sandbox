package streams;

import java.math.BigDecimal;
import java.time.Year;

public class Car {

	Brand brand;

	String model;

	int productionYear;

	Engine engine;

	int milage;

	BigDecimal price;


	public Car(Brand brand, String model, int productionYear, Engine engine, int milage, BigDecimal price) {
		this.brand = brand;
		this.model = model;
		this.productionYear = productionYear;
		this.engine = engine;
		this.milage = milage;
		this.price = price;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand=" + brand +
				", model='" + model + '\'' +
				", productionYear=" + productionYear +
				", engine=" + engine +
				", milage=" + milage +
				", price=" + price +
				'}';
	}
}
