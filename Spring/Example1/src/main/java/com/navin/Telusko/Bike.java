package com.navin.Telusko;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void ride() {
		System.out.println("Bike class");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
}
