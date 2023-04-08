#include <iostream>
#include "HwPhoneBrand.h"
#include "PhoneGame.h"
#include "PhoneCarame.h"

using namespace std;

int main() {
	// 创建hw品牌手机实例
	HwPhoneBrand* hwBrand = new HwPhoneBrand();
	// 聚合两个实现
	// 手机游戏
	PhoneGame* game = new PhoneGame();
	// 手机相机
	PhoneCarame* carame = new PhoneCarame();
	hwBrand->AddPhoneSoft(game);
	hwBrand->AddPhoneSoft(carame);
	hwBrand->Run();
	delete hwBrand;
	delete game;
	delete carame;
	return 0;
}