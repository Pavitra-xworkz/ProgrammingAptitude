package com.xworkz.StarProgram;

public class StarProgram2 {

	public static void main(String[] args) {

		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j =0; j<=num; j++) {
				if(i+j<=num)
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
