package com.atguigu.cxf.spring;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorld
{
	@WebMethod
	@WebResult(name = "sayHelloResult")
	public String sayHello(@WebParam(name = "userName") String name,@WebParam(name = "userAge") int age);
}
