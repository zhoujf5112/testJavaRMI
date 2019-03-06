package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {

	public String  sayHello(String name) throws RemoteException;
}
