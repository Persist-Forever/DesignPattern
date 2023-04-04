#include "HrDept.h"
#include <iostream>

void HrDept::Doduty()
{
	std::cout << "HrDept work ..." << std::endl;
}

void HrDept::Display()
{
	std::cout << "Company id : " << m_id << "  name : " << m_name << std::endl;
}