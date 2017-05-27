package com.atguigu.cxf.test;
public class HelloWorldImpl implements HelloWorld{
	@Override
	public String sayHello(String userName, int age){
		return "hello "+userName+"\t"+age;
	}
}
