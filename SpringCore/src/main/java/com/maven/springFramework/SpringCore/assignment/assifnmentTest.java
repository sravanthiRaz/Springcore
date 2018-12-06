package com.maven.springFramework.SpringCore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class assifnmentTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/maven/springFramework/SpringCore/assignment/assignmentconfig.xml");
		ShoppingCart st =(ShoppingCart)ct.getBean("ShoppingCart");
System.out.println(st);

	}

}
