package com.xworkz.GenaralAptitude.DesignPattern.SingleTonConcept;

public class EagerInitSingleton {
	/*object of class is created when it is loaded to the memory by JVM. 
	It is done by assigning the reference an instance directly.
	*/
	 private static final EagerInitSingleton eagerInitSingleton = new EagerInitSingleton(); 
	  
	  private EagerInitSingleton() 
	  { 
		  System.out.println("invoke " + this.getClass().getSimpleName());
	  } 
	  public static EagerInitSingleton getEagerInitInstance(){ 
	        return eagerInitSingleton; 
	    } 
	  public static void main(String[] args) {
			System.out.println(EagerInitSingleton.getEagerInitInstance());


}
}
