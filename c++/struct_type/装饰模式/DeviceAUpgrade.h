/**
	设备A升级装饰
*/
#pragma once
#include "Decorator.h"
class DeviceAUpgrade : public Decorator {
public:
	DeviceAUpgrade(Component* com) : Decorator(com) {}
	void Upgrade();
};
