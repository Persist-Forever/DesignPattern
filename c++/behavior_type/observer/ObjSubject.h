/**
	主题类：它把所有对观察者对象的引用保存在一个聚集力，每个主题都可以有任何数量的观察者
	抽象主题提供一个接口，可以增加和删除观察者对象，通知观察者
*/
#pragma once
#include <map>
#include <string>
#include "Observer.h"
using namespace std;
class ObjSubject {
public:
	void RegisterObserver(string name, Observer* observer) ;
	void DelObserver(string name);
	void NotifyAll();
	void NotifyOne(string name);
	inline void SetStatus(string status) { m_status = status; }
private:
	map<string, Observer*> m_observer;
	string m_status;
};