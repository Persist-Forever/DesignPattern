#include <iostream>
#include <memory>
#include "MainLandPlug.h"
#include "PlugAdapter.h"

using namespace std;

int main() {
	auto ptr = std::make_unique<PlugAdapter>();
	ptr->MainLandTreePlug();
	return 0;
}