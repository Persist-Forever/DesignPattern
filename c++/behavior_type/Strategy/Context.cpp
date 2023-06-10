#include "Context.h"

void Context::ContextInterface()
{
	if (m_strategy == nullptr) {
		return;
	}
	m_strategy->AlgorithmInterface();
}
