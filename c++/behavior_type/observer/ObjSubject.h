/**
	�����ࣺ�������жԹ۲��߶�������ñ�����һ���ۼ�����ÿ�����ⶼ�������κ������Ĺ۲���
	���������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߶���֪ͨ�۲���
*/
#pragma once
#include <map>
#include <string>
#include "Observer.h"
using namespace std;
class ObjSubject {
public:
	void RegisterObserver(string name, Observer* observer) ;
	void DelObserver(string name);
	void NotifyAll();
	void NotifyOne(string name);
	inline void SetStatus(string status) { m_status = status; }
private:
	map<string, Observer*> m_observer;
	string m_status;
};