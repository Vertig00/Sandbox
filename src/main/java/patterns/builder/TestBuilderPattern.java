package patterns.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder()
				.setGraphicCard("nVidia 1080Ti")
				.setHardDrive("Seagate Barracuda 1T")
				.setSSD(false).setRAM("Aorus 16 Gb")
				.setProcessor("Intel i7 8700K")
				.build();


	}


}
