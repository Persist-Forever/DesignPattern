/**
	�����ࣺ��������֧�ֵ��㷨�Ĺ����ӿ�
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