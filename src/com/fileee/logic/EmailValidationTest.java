package com.fileee.logic;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailValidationTest {
	
	LogicTest emailTest1;
	LogicTest emailTest2;
	LogicTest emailTest3;
	LogicTest emailTest4;
	LogicTest emailTest5;
	LogicTest emailTest6;
	LogicTest emailTest7;
	LogicTest emailTest8;
	LogicTest emailTest9;

	@BeforeEach
	void setUp() throws Exception {
		emailTest1 =  new LogicTest("jon@gmail");
		emailTest2 =  new LogicTest("eln.gin@@in.com");
		emailTest3 =  new LogicTest("mb_score@gmail.com");
		emailTest4 =  new LogicTest("@gmail.com");
		emailTest5 =  new LogicTest("foo.bar@com");
		emailTest6 =  new LogicTest("skyisblue");
		emailTest7 =  new LogicTest("joh_depp@rediff.com");
		emailTest8 =  new LogicTest("jerry19886@yahoo.com");
		emailTest9 =  new LogicTest("jerry19886@yahoo.com");
	}

	@Test
	void test() {
		Assert.assertEquals(false, emailTest1.isEmailValid(emailTest1.testString));
		Assert.assertEquals(false, emailTest2.isEmailValid(emailTest2.testString));
		Assert.assertEquals(true, emailTest3.isEmailValid(emailTest3.testString));
		Assert.assertEquals(false, emailTest4.isEmailValid(emailTest4.testString));
		Assert.assertEquals(false, emailTest5.isEmailValid(emailTest5.testString));
		Assert.assertEquals(false, emailTest6.isEmailValid(emailTest6.testString));
		Assert.assertEquals(true, emailTest7.isEmailValid(emailTest7.testString));
		Assert.assertEquals(true, emailTest8.isEmailValid(emailTest8.testString));
		Assert.assertEquals(true, emailTest9.isEmailValid(emailTest9.testString));
	}

}
