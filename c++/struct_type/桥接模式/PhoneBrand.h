/**
	�����仯һ���ֻ�Ʒ�ƽӿ���
*/
#pragma once
#include <vector>
#include "PhoneSoft.h"
class PhoneBrand {
public:
	inline void AddPhoneSoft(PhoneSoft* soft)
	{
		m_phoneSoft.push_back(soft);
	}
	virtual void Run() = 0;
protected:
	std::vector<PhoneSoft*> m_phoneSoft;
};
