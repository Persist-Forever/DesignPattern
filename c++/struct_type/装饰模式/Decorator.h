/**
	����װ�γ�����
*/
#pragma once
#include "Component.h"
class Decorator : public Component {
public:
	Decorator(Component* com) : m_component(com) {}
	//void Upgrade();
protected:
	Component* m_component;  // ��Ҫ��װ�εĶ���
};