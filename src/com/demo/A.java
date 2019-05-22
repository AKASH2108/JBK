package com.demo;

public class A {

	static {
		
		System.out.println("static A");
	}
	{
		System.out.println("Block A");
	}
	public A() {
		System.out.println("const A");
		// TODO Auto-generated constructor stub
	}

}
