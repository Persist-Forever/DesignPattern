/**
	context 上下文，用一个concreteStrategy来配置，维护一个对Strategy对象的引用
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
