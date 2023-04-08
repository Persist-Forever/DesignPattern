#include <iostream>
#include "HwPhoneBrand.h"
#include "PhoneGame.h"
#include "PhoneCarame.h"

using namespace std;

int main() {
	// ����hwƷ���ֻ�ʵ��
	HwPhoneBrand* hwBrand = new HwPhoneBrand();
	// �ۺ�����ʵ��
	// �ֻ���Ϸ
	PhoneGame* game = new PhoneGame();
	// �ֻ����
	PhoneCarame* carame = new PhoneCarame();
	hwBrand->AddPhoneSoft(game);
	hwBrand->AddPhoneSoft(carame);
	hwBrand->Run();
	delete hwBrand;
	delete game;
	delete carame;
	return 0;
}