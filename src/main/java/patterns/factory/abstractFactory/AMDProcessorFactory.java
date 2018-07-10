package patterns.factory.abstractFactory;

import patterns.factory.AMDProcessor;
import patterns.factory.Processor;

public class AMDProcessorFactory implements AbstractProcessorFactory{

	public Processor createProcessor() {
		return new AMDProcessor();
	}

}
