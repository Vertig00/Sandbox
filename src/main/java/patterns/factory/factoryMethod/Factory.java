package patterns.factory.factoryMethod;

import patterns.factory.Processor;
import patterns.factory.ProcessorType;

interface Factory {

	Processor create(ProcessorType type);

}
