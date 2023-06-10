/**
	����۲��ߣ�Ϊ���еľ���۲��߶���һ���ӿڣ��ڵõ������֪ͨʱ�����Լ�
*/
#pragma once
#include <string>
class Observer {
public:
	Observer(std::string name) : m_name(name) {}
	virtual void Update(std::string status) {};
	inline std::string GetName() { return m_name; }
private:
	std::string m_name;
};