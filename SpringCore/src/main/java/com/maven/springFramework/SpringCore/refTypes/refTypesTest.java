package com.maven.springFramework.SpringCore.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refTypesTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/maven/springFramework/SpringCore/refTypes/refTypesconfig.xml");
Student st =(Student)ct.getBean("Student");
System.out.println(st);

	}

}
