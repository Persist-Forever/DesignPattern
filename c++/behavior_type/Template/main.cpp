#include <iostream>
#include <memory>
#include "TemplateClass.h"
#include "ConcreteTemplate.h"

using namespace std;

int main() {
	auto temp = std::make_unique<ConcreteTemplate>();
	temp->TemplateMethod();
	return 0;
}