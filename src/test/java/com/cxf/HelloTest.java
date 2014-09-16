package com.cxf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.cxf.helloWorld.helloWorld;

public class HelloTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext-client.xml");
    helloWorld helloService = (helloWorld) context.getBean("client");
    String response = helloService.sayHello("Peter");
    System.out.println(response);
  }
}
