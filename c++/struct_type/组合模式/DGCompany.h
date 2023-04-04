/**
	xxx×Ó¹«Ë¾
*/
#pragma once
#include "Company.h"

class DGCompany : public Company {
public:
	DGCompany(uint32_t id, std::string name) : Company(id, name) {}
	virtual void Add(uint32_t id, std::unique_ptr<Company>&& company);
	virtual void Del(uint32_t id);
	virtual void Display();
	void Doduty();
private:
	std::map<uint32_t, std::unique_ptr<Company>> m_company;
};