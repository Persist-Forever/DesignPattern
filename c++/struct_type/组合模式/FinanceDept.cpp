#include "FinanceDept.h"
#include <iostream>

void FinanceDept::Doduty()
{
	std::cout << "FinanceDept work ..." << std::endl;
}

void FinanceDept::Display()
{
	std::cout << "Company id : " << m_id << "  name : " << m_name << std::endl;
}