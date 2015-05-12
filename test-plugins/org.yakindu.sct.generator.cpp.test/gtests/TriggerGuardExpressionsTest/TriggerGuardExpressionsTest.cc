/**
* Copyright (c) 2015 committers of YAKINDU and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     committers of YAKINDU - initial API and implementation
*/
#include <string>
#include "gtest/gtest.h"
#include "TriggerGuardExpressions.h"

TEST(StatemachineTest, trueGuard) {
	TriggerGuardExpressions* statechart = new TriggerGuardExpressions();
	statechart->init();
	statechart->enter();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_A));
	statechart->raise_e1();
	statechart->getDefaultSCI()->set_b(true);
	statechart->runCycle();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_B));
	statechart->runCycle();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_A));
	statechart->raise_e2();
	statechart->runCycle();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_B));
	statechart->runCycle();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_A));
	statechart->raise_e1();
	statechart->raise_e2();
	statechart->runCycle();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_B));
	delete statechart;
}
TEST(StatemachineTest, falseGuard) {
	TriggerGuardExpressions* statechart = new TriggerGuardExpressions();
	statechart->init();
	statechart->enter();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_A));
	statechart->getDefaultSCI()->set_b(false);
	statechart->raise_e1();
	statechart->runCycle();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_A));
	statechart->raise_e2();
	statechart->runCycle();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_A));
	statechart->raise_e1();
	statechart->raise_e2();
	statechart->runCycle();
	EXPECT_TRUE(statechart->isStateActive(TriggerGuardExpressions::main_region_A));
	delete statechart;
}
