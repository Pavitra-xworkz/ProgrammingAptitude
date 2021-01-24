package com.xworkz.GenaralAptitude.DesignPattern.String.methods;

import java.util.Scanner;

public class ReverseNumberUsingWhileLoop {

	public static void main(String[] args) {
		int num = 0;
		int reversenum = 0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;

		}
		System.out.println("reverse number is:" + reversenum);

	}

}
