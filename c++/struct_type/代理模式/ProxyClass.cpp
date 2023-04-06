#include "ProxyClass.h"

ProxyClass::ProxyClass()
{
	m_subject = new RealSubject();
}

ProxyClass::~ProxyClass()
{
	if (m_subject != nullptr) {
		delete m_subject;
		m_subject = nullptr;
	}
}
void ProxyClass::SendFlower()
{
	if (m_subject == nullptr) {
		return;
	}
	m_subject->SendFlower();
}