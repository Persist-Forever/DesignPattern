#include <iostream>
#include "TemplateClass.h"

void TemplateClass::TemplateMethod()
{
	Operator1();
	Operator2();
}
void TemplateClass::Operator1()
{
	std::cout << "�������� 1 ..." << std::endl;
}
void TemplateClass::Operator2()
{
	std::cout << "�������� 2 ..." << std::endl;
}