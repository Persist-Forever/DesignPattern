#include <iostream>
#include <memory>


#include "Company.h"
#include "DGCompany.h"
#include "HrDept.h"
#include "FinanceDept.h"

using namespace std;


int main() {
	auto root = std::make_unique<DGCompany>(1, "��ݸ�ܹ�˾");
	auto hr = std::make_unique<HrDept>(2, "��ݸ�ܲ�HR");
	auto finance = std::make_unique<FinanceDept>(3, "��ݸ�ܲ�����");
	auto root1 = std::make_unique<DGCompany>(4, "����ӹ�˾");
	auto root2 = std::make_unique<DGCompany>(5, "��ɽ���ӹ�˾");
	auto hr2 = std::make_unique<HrDept>(6, "��ɽ���ӹ�˾HR");
	auto finance2 = std::make_unique<FinanceDept>(7, "��ɽ���ӹ�˾����");
	root->Add(2, std::move(hr));
	root->Add(3, std::move(finance));
	root->Add(4, std::move(root1));

	root2->Add(6, std::move(hr2));
	root2->Add(7, std::move(finance2));
	root->Add(5, std::move(root2));

	root->Display();
	root->Doduty();

	return 0;
}