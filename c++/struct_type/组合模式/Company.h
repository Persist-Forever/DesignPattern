/**
	公司管理系统抽象接口
*/
#pragma once
#include <string>
#include <map>
#include <memory>
class Company {
public:
	Company(uint32_t id, std::string name) : m_id(id), m_name(name) {}
	virtual void Add(uint32_t id, std::unique_ptr<Company>&& company) {};
	virtual void Del(uint32_t id) {};
	virtual void Display() {};
	virtual void Doduty() {};
protected:
	uint32_t m_id;
	std::string m_name;
	//std::map<uint32_t, std::unique_ptr<Company>> m_company;
};