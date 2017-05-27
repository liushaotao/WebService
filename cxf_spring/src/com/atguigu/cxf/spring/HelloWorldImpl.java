package com.atguigu.cxf.spring;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

public class HelloWorldImpl implements HelloWorld
{
	@Override
	@WebMethod
	@WebResult(name = "sayHelloResult")
	public String sayHello(@WebParam(name = "userName") String name,@WebParam(name = "userAge") int age)
	{
		return "spring say hello to: " + name + "\t" + "age: " + age;
	}
}
