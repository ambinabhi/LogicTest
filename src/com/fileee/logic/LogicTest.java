package com.fileee.logic;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class LogicTest {

	String testString;

	public LogicTest(String testString) {
		// TODO Auto-generated constructor stub
		this.testString = testString;
	}

	public String pairStar(String testStr) {
		int k = testStr.length();
		if (k > 1) {
			if (testStr.charAt(0) == testStr.charAt(1)) {
				return testStr.charAt(0) + "*" + pairStar(testStr.substring(1));
			} else {
				return testStr.charAt(0) + pairStar(testStr.substring(1));
			}
		} else {
			return testStr.substring(0);
		}
	}

	public Boolean isEmailValid(String email) {

		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		System.out.println("LogicTest");
//		System.out.println(LogicTest.isEmailValid("abhi@gmail"));
//		System.out.println(LogicTest.isEmailValid("eln.gin@@in.com"));
//		System.out.println(LogicTest.isEmailValid("mb_score@gmail.com"));
//		System.out.println(LogicTest.isEmailValid("@gmail.com"));
//		System.out.println(LogicTest.isEmailValid("foo.bar@com"));
//		System.out.println(LogicTest.isEmailValid("skyisblue"));
//		System.out.println(LogicTest.isEmailValid("joh_depp@rediff.com"));
//		System.out.println(LogicTest.isEmailValid("jerry19886@yahoo.com"));
//		System.out.println(LogicTest.isEmailValid("kanye_west@foo.co.in"));
		
	}

}
