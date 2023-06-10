/**
	策略类：定义所有支持的算法的公共接口
*/
#pragma once

#pragma once

#include <iostream>
using namespace std;

class Strategy {

public:
	virtual void AlgorithmInterface() = 0;
	virtual ~Strategy() = default;

};