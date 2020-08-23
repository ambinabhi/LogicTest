

public class LogicTest {

	public static void main(String[] args) {
		PrintUtils.printMessage(SpiltUtils.pairStar("fooBar"));
		PrintUtils.printMessage(SpiltUtils.pairStar("germany"));
		
		String email_2 = "foo.bar@com";
		String email_3 = "your_help@gmail.com";
		
		PrintUtils.printMessage(email_2 + " " + EmailUtils.isEmailValid(email_2));
		PrintUtils.printMessage(email_3 + " " + EmailUtils.isEmailValid(email_3));
		
	}

}
