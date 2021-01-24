package com.xworkz.GenaralAptitude.DesignPattern.SingleTonConcept;

public enum EnumInitSingleton {
	INSTANCE;
	private EnumInitSingleton() {
		System.out.println("invoking "+this.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		System.out.println(EnumInitSingleton.INSTANCE);
	}


}
