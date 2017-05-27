package com.atguigu.cxf.test;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
public class ClientTest{
	public static void main(String[] args){
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress("http://localhost:8888/cxf_demo");
		jaxWsProxyFactoryBean.setServiceClass(HelloWorld.class);
		HelloWorld test = (HelloWorld)jaxWsProxyFactoryBean.create();
		String result = test.sayHello("Tom",18);
		System.out.println("通过客户端调用服务端返回参数："+result);
	}
}
