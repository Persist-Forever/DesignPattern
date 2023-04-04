#include "DGCompany.h"
#include <iostream>
#include  <utility>

void DGCompany::Add(uint32_t id, std::unique_ptr<Company>&& company)
{
	m_company.emplace(std::make_pair(id, std::forward<std::unique_ptr<Company>>(company)));
}

void DGCompany::Del(uint32_t id)
{
	m_company.erase(id);
}

void DGCompany::Display()
{
	std::cout << "Company id : " << m_id << "  name : " << m_name << std::endl;
	for (auto& company : m_company) {
		(company.second)->Display();
	}
}

void DGCompany::Doduty()
{
	std::cout << "DGCompany work ..." << std::endl;
	for (auto& company : m_company) {
		(company.second)->Doduty();
	}
}