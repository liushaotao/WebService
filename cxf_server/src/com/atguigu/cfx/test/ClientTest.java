package com.atguigu.cfx.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ClientTest
{
	public static void main(String[] args)
	{
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		
		jaxWsProxyFactoryBean.setAddress("http://localhost:9999/cxf0315_server");
		
		jaxWsProxyFactoryBean.setServiceClass(HelloWorld.class);
		
		HelloWorld test = (HelloWorld)jaxWsProxyFactoryBean.create();
		
		String result = test.sayHello("li4",24);
		
		System.out.println("###############: "+result);
	}

}
