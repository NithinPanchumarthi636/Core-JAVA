package com.rs.core.java8.ex;
@FunctionalInterface
interface FunctionalInterfaces {
	void abstractFunction(int x);

	//void abstractFunctional(int y);
	// default void normalFunction() {
	// System.out.println("Hello");
	// }
}


public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		FunctionalInterfaces fobj = (int x) -> System.out.println(2 + x);
		fobj.abstractFunction(6);

	}

}
