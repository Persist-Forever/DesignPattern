/**
	����۲��ߣ�ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬�������״̬��Э��
*/
#pragma once
#include "Observer.h"
class StudentObserver : public Observer {
public:
	StudentObserver(std::string name) : Observer(name) {}
	void Update(std::string status) override;
};
