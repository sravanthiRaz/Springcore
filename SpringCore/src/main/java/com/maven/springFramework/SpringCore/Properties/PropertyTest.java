package com.maven.springFramework.SpringCore.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/maven/springFramework/SpringCore/Properties/Propertyconfig.xml");
Language la =(Language)ct.getBean("language");
System.out.println(la.getCountryAndLanguage());

	}

}
