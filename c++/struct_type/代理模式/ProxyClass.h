/**
	�����ࣺ����Ա
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
