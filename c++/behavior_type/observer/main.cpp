#include <iostream>
#include <memory>

#include "ObjSubject.h"
#include "StudentObserver.h"

using namespace std;

int main() {
	auto subject = make_unique<ObjSubject>();
	StudentObserver* stu1 = new StudentObserver("小明");
	StudentObserver* stu2 = new StudentObserver("小红");
	subject->RegisterObserver(stu1->GetName(), stu1);
	subject->RegisterObserver(stu2->GetName(), stu2);
	subject->SetStatus("老师来啦，赶快去做作业....");
	subject->NotifyAll();
	delete stu1;
	delete stu2;
	return 0;
}