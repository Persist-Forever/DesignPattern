#include "DeviceAUpgrade.h"
#include <iostream>
void DeviceAUpgrade::Upgrade()
{
	if (m_component == nullptr) {
		return;
	}
	m_component->Upgrade();
	std::cout << "����1�� �޸�������" << std::endl;
}