#include "DeviceAUpgrade.h"
#include <iostream>
void DeviceAUpgrade::Upgrade()
{
	if (m_component == nullptr) {
		return;
	}
	m_component->Upgrade();
	std::cout << "²¹¶¡1£¬ ÐÞ¸´¡£¡£¡£" << std::endl;
}