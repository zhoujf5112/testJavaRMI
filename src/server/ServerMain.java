package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RMISocketFactory;

/**
 * 服务端
 * @author Administrator
 *
 */
public class ServerMain {

	public static void main(String[] args) throws Exception {
		//服务端创建服务实例
		HelloService helloService = new HelloServiceImpl();
		//注册服务
		LocateRegistry.createRegistry(8801);
		//指定通信端口，防止被防火墙拦截
		RMISocketFactory.setSocketFactory(new CustomerSocketFactory());
		Naming.bind("rmi://localhost:8801/helloService",helloService);
		
		System.out.println("serverMian provide service now");
	}
}
