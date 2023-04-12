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
	// �ȹҺ� ��ȥ��ҽ����� ȥ���ˡ����������߰���Ķ�����װ����
	m_regSys->RegisterHospital();
	m_docSys->DoCheck();
	m_paySys->ClearAccouns();
}