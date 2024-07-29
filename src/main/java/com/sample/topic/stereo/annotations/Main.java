package com.sample.topic.stereo.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext
				("classpath:com/sample/topic/stereo/annotations/spring1.xml");
		ctx.getBean(Circle.class).area();
		ctx.getBean(Rectangle.class).area();
		ctx.getBean(Square.class).area();
	}
}
