package server;

import org.apache.log4j.Logger;
import server.sbehavior.IOBehavior;
import server.sbehavior.ServerBehavior;
import remote.RemoteServerInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public abstract class Server extends UnicastRemoteObject implements Runnable, RemoteServerInterface{


	private ServerBehavior behavior = new IOBehavior();
	static Logger logger = org.apache.log4j.Logger.getLogger(Server.class);
	private String name = "Server";
	private double weight = 1;

	public Server() throws RemoteException{

	}

	public Server(ServerBehavior behavior, String name, double weight) throws RemoteException {
		this.name += name;
		this.behavior = behavior;
		this.weight = weight;
	}

	public void wasteRes(){
		synchronized (this) {
			this.logger.info(name + " started the waste Method!");
			behavior.useRes();
		}
	}

	public void setBehavior(ServerBehavior sb) {
		this.behavior = sb;
	}

	public void addServer(String adress) {

	}

	public double getWeight(){
		return weight;
	}

}
