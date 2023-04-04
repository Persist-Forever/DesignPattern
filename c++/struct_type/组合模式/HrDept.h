/*
	HR ≤ø√≈
*/

#pragma once
#include "Company.h"

class HrDept : public Company {
public:
	HrDept(uint32_t id, std::string name) : Company(id, name) {}
	void Doduty();
	void Display();
};
