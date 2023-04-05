#include "PlugAdapter.h"
#include <iostream>

PlugAdapter::PlugAdapter()
{
	m_adpter = std::make_unique<HongkongPlug>();
}

void PlugAdapter::MainLandTreePlug()
{
	if (m_adpter == nullptr) {
		std::cout << "adpter is nullptr ... " << std::endl;
		return;
	}
	m_adpter->HongkongTreePlug();
}
