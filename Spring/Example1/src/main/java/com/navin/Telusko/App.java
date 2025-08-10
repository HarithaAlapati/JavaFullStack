package com.navin.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	This we know already how to create a object
	 *  Car car = new Car();
		car.drive();*/
		
	/*  XML CONFIGURATION 
	 *  use in spring.xml <bean id="vehicle/vehicle1" class="com.navin.Telsuko.Car/Bike"></bean>
	  	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj = (Vehicle) context.getBean("vehicle");
		obj.drive();
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj1 = (Vehicle) context1.getBean("vehicle1");
		obj1.ride(); */
		
/*		ANNOTATION CONFIGURATION
 * 		in spring.xml use <config:component-scan></>
  		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj = (Vehicle) context.getBean("car");
		obj.drive();
		obj.ride(); */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car obj = (Car) context.getBean("car");
		obj.drive();
		
		
		
			
	}

}
