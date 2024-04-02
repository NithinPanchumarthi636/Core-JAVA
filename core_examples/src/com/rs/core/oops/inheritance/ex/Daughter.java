package com.rs.core.oops.inheritance.ex;

public class Daughter extends Father {

	public static void main(String[] args) {

		Father father = new Daughter();
		float amountToDaughter = father.getAmount(40);
		System.out.println("Amount to daughter:" + amountToDaughter);

	}

	@Override
	public float getAmount(int percentage) {
		
		  //super.credits =30000000;
		
		return (super.credits - super.debits) * percentage / 100;
	}
	
	/*
	@Override
	public float toParent() {
		
		return super.toParent();
	}
     */
	
	
}
