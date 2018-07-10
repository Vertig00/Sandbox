package patterns.factory.abstractFactory;

import patterns.factory.Processor;

public interface AbstractProcessorFactory {

	public Processor createProcessor();
}
