package com.rs.fer.core.constructor.ex;

public class Rectangle {

	int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 4);

		System.out.println("Area: " + rectangle.getArea());

	}

}
