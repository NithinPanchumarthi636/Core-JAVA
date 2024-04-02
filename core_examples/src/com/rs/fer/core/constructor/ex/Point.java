package com.rs.fer.core.constructor.ex;

public class Point {
	
	int x,y;
	
	public Point(){// default constructor
		this(0,0);
	}
	public Point(int x,int y) {
		this.x = x;   //parameterized constructor
		this.y = y;
	}

	public static void main(String[] args) {
		
		Point p1= new Point();
		Point p2= new Point(3,4);
		
		System.out.println("P1: (" + p1.x +" ," +p1.y + ")");
		System.out.println("P2: (" + p2.x +" ," +p2.y + ")");
	}

}
