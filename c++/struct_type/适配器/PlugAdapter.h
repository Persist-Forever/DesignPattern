/**
	²åÍ·×ª»»ÊÊÅäÆ÷
*/
#pragma once
#include "MainLandPlug.h"
#include <memory>
#include "HongkongPlug.h"
class PlugAdapter : public MainLandPlug {
public:
	PlugAdapter();
	virtual ~PlugAdapter() = default;
	void MainLandTreePlug();
private:
	std::unique_ptr<HongkongPlug> m_adpter{ nullptr };
};