package patterns.factory.factoryMethod;

import patterns.factory.AMDProcessor;
import patterns.factory.IntelProcessor;
import patterns.factory.Processor;
import patterns.factory.ProcessorType;

public class ProcessorFactory implements Factory{


	public Processor create(ProcessorType type) {
		Processor processor = null;
		switch (type) {
			case INTEL:
				processor = new IntelProcessor();
				break;
			case AMD:
				processor = new AMDProcessor();
				break;
			default:
				processor = new IntelProcessor();
				break;
		}
		return processor;
	}

}
