package com.sample.topic.stereo.annotations;

import org.springframework.stereotype.Component;

@Component("c1") // <bean id="circle" class="com.sample.stereo.annotations.Circle"/>
public class Circle {
	
	public Circle() {
		System.out.println("In Circle Constructior");
	}
	public void area() {
		System.out.println("Circle Area Method...");
	}
}
