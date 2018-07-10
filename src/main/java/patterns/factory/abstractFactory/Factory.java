package patterns.factory.abstractFactory;

import patterns.factory.ProcessorType;

public class Factory {

	private AbstractProcessorFactory processorFactory;

	public void chooseProcesor(ProcessorType type) {
		switch (type) {
			case INTEL:
				processorFactory = new IntelProcessorFactory();
				break;
			case AMD:
				processorFactory = new AMDProcessorFactory();
				break;
		}
	}

}
