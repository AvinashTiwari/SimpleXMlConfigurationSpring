package com.avinash.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avinash.bean.ClassA;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applciation.xml");
		ClassA bean = container.getBean(ClassA.class);
		bean.bussinessmethod();
		container.close();
	}

}
