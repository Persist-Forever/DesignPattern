/**
	门面模式对外接口
	医院接待员，用来处理 挂号、门诊、划价、取药 等一系列动作。
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
	void DoWork();  // 完成子系统一系列操作的封装
private:
	std::unique_ptr<PayMoney> m_paySys;
	std::unique_ptr<RegisterOrder> m_regSys;
	std::unique_ptr<Doctor> m_docSys;
};
