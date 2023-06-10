/**
	实现了一个模板方法，定义了算法的股价，具体子类将重定义一些步骤
*/
#pragma once
class TemplateClass {
public:
	void TemplateMethod();
	virtual void Operator1();
	virtual void Operator2();
};
