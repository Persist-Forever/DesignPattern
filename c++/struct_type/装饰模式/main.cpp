#include <iostream>
#include "ConcreteComponent.h"
#include "DeviceAUpgrade.h"

using namespace std;

int main() {
	// �豸��ʼ�汾v1.0
	ConcreteComponent* com = new ConcreteComponent();
	// �޸������汾v2.0
	DeviceAUpgrade* grade = new DeviceAUpgrade(com);
	grade->Upgrade();
	delete grade;
	delete com;
	return 0;
}