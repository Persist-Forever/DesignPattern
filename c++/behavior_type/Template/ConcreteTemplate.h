/**
	实现具体的子步骤
*/
#pragma once
#include "TemplateClass.h"
class ConcreteTemplate : public TemplateClass {
public:
	void Operator1() override;
	void Operator2() override;
};
