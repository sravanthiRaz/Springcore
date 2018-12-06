package com.maven.springFramework.SpringCore.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/maven/springFramework/SpringCore/Map/Mapconfig.xml");
Customer cu =(Customer)ct.getBean("customer");
System.out.println(cu.getId());
System.out.println(cu.getProducts());
	}

}
