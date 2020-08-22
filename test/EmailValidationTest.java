

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmailValidationTest {

	@Test
	void test_emailValidationNoCharBefore_shouldFail() {
		Assert.assertEquals(false, EmailUtils.isEmailValid("@foo.com"));
	}
	
	@Test
	void test_emailValidationNoDotAfter_shouldFail() {
		Assert.assertEquals(false, EmailUtils.isEmailValid("foo.bar@com"));
	}
	
	@Test
	void test_emailValidationNoAdrress_shouldFail() {
		Assert.assertEquals(false, EmailUtils.isEmailValid("someone.in.com"));
	}
	
	@Test
	void test_emailValidationNoDots_shouldFail() {
		Assert.assertEquals(false, EmailUtils.isEmailValid("luciferruleshell"));
	}
	
	@Test
	void test_emailValidationWithNumbers_shouldPass() {
		Assert.assertEquals(true, EmailUtils.isEmailValid("ma_john1982@gmail.com"));
	}
	
	@Test
	void test_emailValidationWithChar_shouldPass() {
		Assert.assertEquals(true, EmailUtils.isEmailValid("kw_forPresident@yahoo.co.in"));
	}

}
