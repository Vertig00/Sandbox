package patterns.factory.abstractFactory;

import patterns.factory.IntelProcessor;
import patterns.factory.Processor;

public class IntelProcessorFactory implements AbstractProcessorFactory{

	public Processor createProcessor() {
		return new IntelProcessor();
	}

}
