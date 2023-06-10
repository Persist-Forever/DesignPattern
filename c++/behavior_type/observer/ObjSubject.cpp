#include "ObjSubject.h"

void ObjSubject::RegisterObserver(string name, Observer* observer)
{
	m_observer.emplace(name, observer);  // 重复注册时无效
}
void ObjSubject::DelObserver(string name)
{
	m_observer.erase(name);
}
void ObjSubject::NotifyAll()
{
	for (const auto& itr : m_observer) {
		if (itr.second == nullptr) {
			continue;
		}
		itr.second->Update(m_status);
	}
}
void ObjSubject::NotifyOne(string name)
{
	auto itr = m_observer.find(name);
	if (itr != m_observer.end() && itr->second != nullptr) {
		itr->second->Update(m_status);
	}
}