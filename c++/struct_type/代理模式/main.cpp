#include <iostream>

#include "ProxyClass.h"

using namespace std;

int main() {
	auto proxy = make_unique<ProxyClass>();
	proxy->SendFlower();
	return 0;
}