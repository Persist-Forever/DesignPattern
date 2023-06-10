#include <iostream>
#include "StudentObserver.h"

void StudentObserver::Update(std::string status)
{
	std::cout << status << std::endl;
	std::cout << "学生根据状态要做不同的操作" << std::endl;
}