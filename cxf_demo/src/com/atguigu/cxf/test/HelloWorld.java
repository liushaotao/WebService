package com.atguigu.cxf.test;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorld{
	
	@WebMethod
	@WebResult(name="sayHelloReturn")
	public String sayHello(@WebParam(name="userName") String userName,@WebParam(name="age") int age);
}
