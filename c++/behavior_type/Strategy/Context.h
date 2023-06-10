/**
	context �����ģ���һ��concreteStrategy�����ã�ά��һ����Strategy���������
*/
#pragma once
#include "Strategy.h"
class Context {

public:
	Context(std::unique_ptr<Strategy>&& stategy) {
		m_strategy = std::move(stategy);
	}
	~Context() = default;
	void ContextInterface();
private:
	std::unique_ptr<Strategy> m_strategy{ nullptr };
};
