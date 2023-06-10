#include <iostream>
#include <memory>

#include "ObjSubject.h"
#include "StudentObserver.h"

using namespace std;

int main() {
	auto subject = make_unique<ObjSubject>();
	StudentObserver* stu1 = new StudentObserver("С��");
	StudentObserver* stu2 = new StudentObserver("С��");
	subject->RegisterObserver(stu1->GetName(), stu1);
	subject->RegisterObserver(stu2->GetName(), stu2);
	subject->SetStatus("��ʦ�������Ͽ�ȥ����ҵ....");
	subject->NotifyAll();
	delete stu1;
	delete stu2;
	return 0;
}