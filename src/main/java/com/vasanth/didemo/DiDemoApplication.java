package com.vasanth.didemo;

import com.vasanth.didemo.controllers.ConstructerInjectedController;
import com.vasanth.didemo.controllers.MyController;
import com.vasanth.didemo.controllers.PropertyInjectedController;
import com.vasanth.didemo.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController = context.getBean("myController", MyController.class);
		myController.hello();

		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectionController.class).sayHello());
		System.out.println(context.getBean(ConstructerInjectedController.class).sayHello());

	}
}
