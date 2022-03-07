package com.example.demo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassA o = (ClassA) applicationContext.getBean("a");
		ClassB o1 = (ClassB) applicationContext.getBean("b");
		o.say();
		o1.say();
	}

}
