package com.xworkz.GenaralAptitude.JavaBasicPgm;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();

		// if number is divisible by 2 then it is even number or else odd number
		if (num % 2 == 0) {
			System.out.println("enter number is even");
		} else {
			System.out.println("enter number is odd");

		}
	}

}
