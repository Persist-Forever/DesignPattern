/**
	�豸A����װ��
*/
#pragma once
#include "Decorator.h"
class DeviceAUpgrade : public Decorator {
public:
	DeviceAUpgrade(Component* com) : Decorator(com) {}
	void Upgrade();
};
