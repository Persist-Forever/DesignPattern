/**
	����Ĳ����࣬��װ�˾�����㷨����Ϊ���̳���Strategy
	�����о������������ࣺConcreteStrategyA ConcreteStrategyB ConcreteStrategyC
*/
#pragma once
#include "Strategy.h"

class ConcreteStrategyA : public Strategy {
public:
	void AlgorithmInterface() override;

	~ConcreteStrategyA() = default;
};

class ConcreteStrategyB : public Strategy {

public:
	void AlgorithmInterface() override;

	~ConcreteStrategyB() = default;
};

class ConcreteStrategyC : public Strategy {

public:
	void AlgorithmInterface() override;

	~ConcreteStrategyC() = default;
};
