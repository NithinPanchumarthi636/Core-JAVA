package com.rs.core.oops.inheritance.ex;

public abstract class Father  {
	
	 final int credits= 20000000;
	int debits= 1000000;
	
	public  abstract float getAmount(int percentage);
	
	public final float toParent() {
	return 500000;
	}

}
