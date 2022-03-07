package com.example.demo.constructor.injection;

public class ClassA {
	private ClassB b;

	public ClassA(ClassB b) {
		this.b = b;
		System.out.println("Hi");
	}

}
