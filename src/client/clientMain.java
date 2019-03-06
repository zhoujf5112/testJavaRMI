package client;

import java.rmi.Naming;

import server.HelloService;

/**
 * 客户端
 * @author Administrator
 *
 */
public class clientMain {

	public static void main(String[] args) throws Exception {
		//通过接口从RMI registry获取服务对象
		HelloService helloService = (HelloService)Naming.lookup("rmi://localhost:8801/helloService");
		String sayHello = helloService.sayHello("RMI");
		System.out.println(sayHello);
	}
}
