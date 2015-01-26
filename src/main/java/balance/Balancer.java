package balance;

import balance.bbehavior.BalancerBehavior;
import remote.RemoteBalancerInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public abstract class Balancer extends UnicastRemoteObject implements Runnable, RemoteBalancerInterface{

	public Balancer() throws RemoteException{

	}
	private HashMap<String,Integer> loadFactor;
	private BalancerBehavior behavior;

	public Balancer(BalancerBehavior behavior) throws RemoteException{

	}

	public void addServer(String address) {
		loadFactor.put(address,1);
	}

	public String balance(BalancerBehavior behavior) {
		return null;
	}

	public String getAddress() {
		return null;
	}

}
