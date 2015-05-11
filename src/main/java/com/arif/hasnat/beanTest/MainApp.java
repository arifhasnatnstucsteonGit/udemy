package com.arif.hasnat.beanTest;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String arg[]){
		ApplicationContext contex=new FileSystemXmlApplicationContext("ApplicationContextBean.xml");
		Person p=(Person)contex.getBean("persn");
		p.say();
		
		
	}
    
}
