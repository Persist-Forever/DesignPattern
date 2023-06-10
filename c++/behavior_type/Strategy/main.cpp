#include <iostream>
#include "ConcreteStrategy.h"
#include "Context.h"

using namespace std;

int main() {
	Context* contextA = new Context(make_unique<ConcreteStrategyA>());
	Context* contextB = new Context(make_unique<ConcreteStrategyB>());
	Context* contextC = new Context(make_unique<ConcreteStrategyC>());
	contextA->ContextInterface();
	contextB->ContextInterface();
	contextC->ContextInterface();
	delete contextA;
	delete contextB;
	delete contextC;
	return 0;
}