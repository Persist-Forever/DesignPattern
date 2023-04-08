#include "HwPhoneBrand.h"
#include <iostream>

void HwPhoneBrand::Run()
{
	std::cout << "run hw phone ..." << std::endl;
	for (auto soft : m_phoneSoft) {
		soft->Run();
	}
}