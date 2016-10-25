package pand.dubbo.controller;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-provider.xml");  

		context.start();  
        try {
			System.in.read();// 为保证服务一直开着，利用输入流的阻塞来模拟
        	
        	
        	Provider provider = new Provider();
        	
        	String xx  = provider.getClass().getClassLoader().getResource("").getPath();
        	System.out.println(xx);
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
