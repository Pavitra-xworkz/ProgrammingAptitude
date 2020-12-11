package com.xworkz.StarProgram;

public class LeftAngel {
	public static void main(String[] args) {

		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (j==num||i+j==num||i==num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
