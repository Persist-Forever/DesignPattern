/**
	²ÆÎñ²¿
*/
#pragma once
#include "Company.h"

class FinanceDept : public Company {
public:
	FinanceDept(uint32_t id, std::string name) : Company(id, name) {}
	void Display();
	void Doduty();
};