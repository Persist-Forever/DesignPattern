/**
	抽象观察者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己
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