package com.sample.topic.stereo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainUsingComponentScan {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(ComponentScanJavaApproach.class);
		
		ctx.getBean(Circle.class).area();
		ctx.getBean(Rectangle.class).area();
		ctx.getBean(Square.class).area();
		ctx.close();
	}
}
