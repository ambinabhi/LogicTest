

public class LogicTest {

	public static void main(String[] args) {
		PrintUtils.printMessage(SpiltUtils.pairStar("fooBar"));
		PrintUtils.printMessage(SpiltUtils.pairStar("aaahhjjj"));
		PrintUtils.printMessage(SpiltUtils.pairStar("bookkeeper"));
		PrintUtils.printMessage(SpiltUtils.pairStar("germany"));
		
		String email_1 = "@foo.com";
		String email_2 = "foo.bar@com";
		String email_3 = "your_help@gmail.com";
		String email_4 = "mb_rest@yahoo.co.in";
		
		PrintUtils.printMessage(email_1 + " " + EmailUtils.isEmailValid(email_1));
		PrintUtils.printMessage(email_2 + " " + EmailUtils.isEmailValid(email_2));
		PrintUtils.printMessage(email_3 + " " + EmailUtils.isEmailValid(email_3));
		PrintUtils.printMessage(email_4 + " " + EmailUtils.isEmailValid(email_4));
	}

}
