package com.demo;

public class B extends A {
	static {
		System.out.println("static B");
	}
	
	{
		
		System.out.println("block B");
	}

	public B() {
		System.out.println("const B");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		A a = new B();
	
	}
	
}
