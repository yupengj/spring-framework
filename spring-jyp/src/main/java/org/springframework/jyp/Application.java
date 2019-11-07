package org.springframework.jyp;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jyp.config.ApplicationConfig;

public class Application {

	public static void main(String[] args) {
		System.out.println("========");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println(context.getBean("contextBeanTest"));
	}
}
