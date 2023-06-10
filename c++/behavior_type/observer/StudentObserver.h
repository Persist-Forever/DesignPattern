/**
	具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调
*/
#pragma once
#include "Observer.h"
class StudentObserver : public Observer {
public:
	StudentObserver(std::string name) : Observer(name) {}
	void Update(std::string status) override;
};
