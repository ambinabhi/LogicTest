
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.fileee.logic.SpiltUtils;

class StringPairTestCase {

	@Test
	void test_pairWithSingleLetter_repeted() {
		Assert.assertEquals("fo*oBar", SpiltUtils.pairStar("fooBar"));
	}

	@Test
	void test_pairWithMultiLetter_repeted() {
		Assert.assertEquals("a*a*ah*hj*j*j", SpiltUtils.pairStar("aaahhjjj"));
	}

	@Test
	void test_pairWithMultiLetter_continued() {
		Assert.assertEquals("bo*ok*ke*eper", SpiltUtils.pairStar("bookkeeper"));
	}

	@Test
	void test_noLetter_repeated() {
		Assert.assertEquals("skyisthelimit", SpiltUtils.pairStar("skyisthelimit"));
	}

	@Test
	void test_pairPaliandrom() {
		Assert.assertEquals("skyisthelimit", SpiltUtils.pairStar("skyisthelimit"));
	}

}
