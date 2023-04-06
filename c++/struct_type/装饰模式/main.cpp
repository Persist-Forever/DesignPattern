#include <iostream>
#include "ConcreteComponent.h"
#include "DeviceAUpgrade.h"

using namespace std;

int main() {
	// 设备初始版本v1.0
	ConcreteComponent* com = new ConcreteComponent();
	// 修复补丁版本v2.0
	DeviceAUpgrade* grade = new DeviceAUpgrade(com);
	grade->Upgrade();
	delete grade;
	delete com;
	return 0;
}