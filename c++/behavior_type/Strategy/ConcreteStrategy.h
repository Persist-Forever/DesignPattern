/**
	具体的策略类，封装了具体的算法或行为，继承于Strategy
	这里列举了三个策略类：ConcreteStrategyA ConcreteStrategyB ConcreteStrategyC
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
