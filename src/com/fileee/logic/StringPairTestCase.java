package com.fileee.logic;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringPairTestCase {
	
	LogicTest pairTest1;
	LogicTest pairTest2;
	LogicTest pairTest3;
	LogicTest pairTest4;
	LogicTest pairTest5;
	LogicTest pairTest6;
	@BeforeEach
	void setUp() throws Exception {
		pairTest1 =  new LogicTest("fooBar");
		pairTest2 =  new LogicTest("aaahhjjj");
		pairTest3 =  new LogicTest("bookkeeper");
		pairTest4 =  new LogicTest("coolBaar");
		pairTest5 =  new LogicTest("sentence");
		pairTest6 =  new LogicTest("skyisblue");
	}

	@Test
	void test() {
		Assert.assertEquals("fo*oBar", pairTest1.pairStar(pairTest1.testString));
		Assert.assertEquals("a*a*ah*hj*j*j", pairTest2.pairStar(pairTest2.testString));
		Assert.assertEquals("bo*ok*ke*eper", pairTest3.pairStar(pairTest3.testString));
		Assert.assertEquals("co*olBa*ar", pairTest4.pairStar(pairTest4.testString));
		Assert.assertEquals("sentence", pairTest5.pairStar(pairTest5.testString));
		Assert.assertEquals("skyisblue", pairTest6.pairStar(pairTest6.testString));
	}

}
