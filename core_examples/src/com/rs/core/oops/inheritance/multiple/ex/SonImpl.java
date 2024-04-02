package com.rs.core.oops.inheritance.multiple.ex;

public class SonImpl implements Father, Mother {

	public static void main(String[] args) {
		Father father = new SonImpl();
		float amountFromFather = father.getAmountFromFather(60);
		System.out.println("Amount from Father: " + amountFromFather);

		Mother mother = new SonImpl();
		float amountFromMother = mother.getAmountFromMother(40);
		System.out.println("Amount from Mother:" + amountFromMother);

	}

	@Override
	public float getAmountFromMother(int percentage) {
		return (Father.credits - Father.debits) * percentage / 100;
	}

	@Override
	public float getAmountFromFather(int percentage) {
		return (Mother.credits - Mother.debits) * percentage / 100;
	}

}
