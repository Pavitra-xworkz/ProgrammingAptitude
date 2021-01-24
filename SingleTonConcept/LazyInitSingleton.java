package com.xworkz.GenaralAptitude.DesignPattern.SingleTonConcept;

public class LazyInitSingleton {
	// Object is created only if it is needed.
	// It may overcome resource overcome and wastage of CPU time.
	static LazyInitSingleton lazyInitSingleton;

	private LazyInitSingleton() {
		System.out.println("invoke " + this.getClass().getSimpleName());
	}

	public static synchronized LazyInitSingleton getlazyInitInstance() {
		if (lazyInitSingleton == null)
			lazyInitSingleton = new LazyInitSingleton();
		return lazyInitSingleton;
	}

	public static void main(String[] args) {

		System.out.println(LazyInitSingleton.class);
		System.out.println(LazyInitSingleton.getlazyInitInstance());
		System.out.println("instance2 " + LazyInitSingleton.getlazyInitInstance());

	}

}
