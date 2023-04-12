#include "Receptionist.h"

Receptionist::Receptionist()
{
	m_docSys = std::make_unique<Doctor>();
	m_paySys = std::make_unique<PayMoney>();
	m_regSys = std::make_unique<RegisterOrder>();
}


void Receptionist::DoWork()
{
	if (m_docSys == nullptr || m_paySys == nullptr || m_regSys == nullptr) {
		return;
	}
	// 先挂号 再去找医生诊断 去结账。。。等乱七八糟的动作封装起来
	m_regSys->RegisterHospital();
	m_docSys->DoCheck();
	m_paySys->ClearAccouns();
}