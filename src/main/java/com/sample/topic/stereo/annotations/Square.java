package com.sample.topic.stereo.annotations;

import org.springframework.stereotype.Component;

@Component("s1")
public class Square {
	
	public Square() {
		System.out.println("In Square Constructor");
	}
	public void area() {
		System.out.println("Square Area Method...");
	}
}
