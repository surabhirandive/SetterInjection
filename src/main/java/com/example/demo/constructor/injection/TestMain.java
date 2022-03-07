package com.example.demo.constructor.injection;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassA a = (ClassA) applicationContext.getBean("a");
		ClassB b = (ClassB) applicationContext.getBean("b");

	}
//org.springframework.beans.factory.BeanCurrentlyInCreationException
}
