package com.atguigu.cxf.test;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
public class MainServer{
	public static void main(String[] args){
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		jaxWsServerFactoryBean.setAddress("http://localhost:9999/cxf_demo");
		jaxWsServerFactoryBean.setServiceClass(HelloWorldImpl.class);
		Server server = jaxWsServerFactoryBean.create();
		server.start();
	}
}
