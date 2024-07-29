package com.sample.topic.stereo.annotations;

import org.springframework.stereotype.Component;

@Component("r1")
public class Rectangle {
	
	public Rectangle() {
		System.out.println("In Rectangle Constructor");
	}
	public void area() {
		System.out.println("Rectangle Area Method...");
	}
}
