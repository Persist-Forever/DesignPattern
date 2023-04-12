/**
	����ģʽ����ӿ�
	ҽԺ�Ӵ�Ա���������� �Һš�������ۡ�ȡҩ ��һϵ�ж�����
*/
#pragma once
#include <memory>
#include "PayMoney.h"
#include "RegisterOrder.h"
#include "Doctor.h"

class Receptionist {
public:
	Receptionist();
	virtual ~Receptionist() = default;
	void DoWork();  // �����ϵͳһϵ�в����ķ�װ
private:
	std::unique_ptr<PayMoney> m_paySys;
	std::unique_ptr<RegisterOrder> m_regSys;
	std::unique_ptr<Doctor> m_docSys;
};
