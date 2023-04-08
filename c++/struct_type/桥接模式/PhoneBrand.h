/**
	独立变化一：手机品牌接口类
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
