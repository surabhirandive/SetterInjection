package com.example.demo.constructor.injection;

public class ClassB {
	private ClassA a;

	public ClassB(ClassA a) {
		this.a = a;
		System.out.println("Hello");
	}

}
