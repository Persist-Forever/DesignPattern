#include <iostream>
#include "ConcreteStrategy.h"
void ConcreteStrategyA::AlgorithmInterface()
{
	std::cout << "do ConcreteStrategyA..." << std::endl;
}

void ConcreteStrategyB::AlgorithmInterface()
{
	std::cout << "do ConcreteStrategyB..." << std::endl;
}

void ConcreteStrategyC::AlgorithmInterface()
{
	std::cout << "do ConcreteStrategyC..." << std::endl;
}