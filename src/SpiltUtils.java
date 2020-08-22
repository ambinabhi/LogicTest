

public class SpiltUtils {

	public static String pairStar(String testStr) {
		int str_length = testStr.length();
		if (str_length > 1) {
			if (testStr.charAt(0) == testStr.charAt(1)) {
				return testStr.charAt(0) + "*" + pairStar(testStr.substring(1));
			} else {
				return testStr.charAt(0) + pairStar(testStr.substring(1));
			}
		} else {
			return testStr.substring(0);
		}
	}

}
