/**
	升级装饰抽象类
*/
#pragma once
#include "Component.h"
class Decorator : public Component {
public:
	Decorator(Component* com) : m_component(com) {}
	//void Upgrade();
protected:
	Component* m_component;  // 需要被装饰的对象
};