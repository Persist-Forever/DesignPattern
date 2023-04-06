/**
	代理类：外卖员
*/
#pragma once
#include "Subject.h"
#include "RealSubject.h"
class ProxyClass : public Subject {
public:
	ProxyClass();
	virtual ~ProxyClass();
	void SendFlower();
private:
	Subject* m_subject;
};
