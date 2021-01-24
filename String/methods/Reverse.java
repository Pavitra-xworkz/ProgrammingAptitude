package com.xworkz.methods;

public class Reverse {
	public static void main(String[]args){
		Reverse reverse=new Reverse();
		reverse.name();
	}
	public void name(){
		String myname="pavitra";
		System.out.println("my name:"+myname);
		for(int i=myname.length()-1;i>=0;i--){
			System.out.print("\n reverse of my name:"+myname.charAt(i));
		}
	}
	}


