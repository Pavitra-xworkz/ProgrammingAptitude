package com.xworkz.StarProgram;

public class StarProgram3 {
	public static void main(String[] args) {

		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if(i==0|| i+j<=num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
