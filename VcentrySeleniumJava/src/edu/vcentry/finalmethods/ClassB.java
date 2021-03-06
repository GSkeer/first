package edu.vcentry.finalmethods;

public class ClassB extends ClassA{
	
	void printC() {
		//printA(); - Print A is not Visible, since the access specifier is default
		System.out.println("printC() is accessed within Package");
	}
	
	public void printD() {
		printB(); // Eventhough it is not in the same package B is a sub class of A hence Accessible.
		System.out.println("printD() is accessed outside Package. Public");
	}

	/*
	 * Final method cannot be overridden
	 * void finalMethod() {
		System.out.println("Final Overridden in B");
	}*/
}
