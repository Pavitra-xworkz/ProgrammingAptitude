package com.xworkz.GenaralAptitude.DesignPattern.String.methods;

public class CharArrayToString {
	public static void main(String[] args) {
		// array format
		char[] ch = { 'p', 'a', 'v', 'i' };
		String str = new String(ch);
		System.out.println(str);
		// String by using ValueOf
		String str2 = String.valueOf(ch);
		System.out.println(str2);

	}

}
