package patterns.builder;

public class Computer {

	private String hardDrive;

	private boolean isSSD;

	private String RAM;

	private String graphicCard;

	private String processor;

	private Computer(ComputerBuilder builder) {
		this.hardDrive = builder.hardDrive;
		this.isSSD = builder.isSSD;
		this.RAM = builder.RAM;
		this.graphicCard = builder.graphicCard;
		this.processor = builder.processor;
	}


	public String getHardDrive() {
		return hardDrive;
	}

	public boolean isSSD() {
		return isSSD;
	}

	public String getRAM() {
		return RAM;
	}

	public String getGraphicCard() {
		return graphicCard;
	}

	public String getProcessor() {
		return processor;
	}


	public static class ComputerBuilder {

		private String hardDrive;

		private boolean isSSD;

		private String RAM;

		private String graphicCard;

		private String processor;

		public ComputerBuilder() {}

		public ComputerBuilder setHardDrive(String hardDrive) {
			this.hardDrive = hardDrive;
			return this;
		}

		public ComputerBuilder setSSD(boolean SSD) {
			isSSD = SSD;
			return this;
		}

		public ComputerBuilder setRAM(String RAM) {
			this.RAM = RAM;
			return this;
		}

		public ComputerBuilder setGraphicCard(String graphicCard) {
			this.graphicCard = graphicCard;
			return this;
		}

		public ComputerBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
