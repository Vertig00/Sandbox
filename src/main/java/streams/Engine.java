package streams;

public class Engine {

	String name;

	String type;

	double power;

	public Engine(String name, String type, double power) {
		this.name = name;
		this.type = type;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Engine{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				", power=" + power +
				'}';
	}
}
