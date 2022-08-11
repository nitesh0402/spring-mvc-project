package com.springcore.example;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("studentconfig.xml");
		Student student1 = (Student) beanFactory.getBean("studentbean1");
		Student student2 = (Student) beanFactory.getBean("studentbean2");
		Student student3 = (Student) beanFactory.getBean("studentbean3");

		student1.setName("nitesh");

		student1.displayInfo();

		student2.setName("yogesh");
		student2.displayInfo();

		student3.setName("rahul");
		student3.displayInfo();

		// IOC container 1- ApplicationContext, 2- BeanFactory

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("studentconfig.xml"); Student student =
		 * (Student) context.getBean("studentbean");
		 * 
		 * student.displayInfo();
		 */
	}

}