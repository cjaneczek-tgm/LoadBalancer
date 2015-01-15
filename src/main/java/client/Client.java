package client;

import balance.Balancer;
import org.apache.log4j.Logger;
import remote.RemoteBalancerInterface;
import remote.RemoteServerInterface;
import server.Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Client Object which gets an Server via RMI Communication to LoadBalancer
 * Starts the wasteRes Method of the Server
 */
public class Client implements Runnable, RemoteServerInterface, RemoteBalancerInterface {

	private String balancerAddress;
	private String serverAddress;
	static Logger logger = org.apache.log4j.Logger.getLogger(Client.class);

	private RemoteServerInterface remoteServer;
	private RemoteBalancerInterface remoteBalancer;

	public Client(String balancerAddress) throws RemoteException, MalformedURLException, NotBoundException {

	}

	public String getAddress() {
		try {
			remoteBalancer = (Balancer) Naming.lookup("rmi://" + balancerAddress);

			return remoteBalancer.getAddress();
		} catch (RemoteException re) {
			this.logger.info("Client triggered an Remote Exception.\n" + re.getMessage());
			return null;
		} catch (MalformedURLException murle) {
			this.logger.info("Client triggered an MalformedURL Exception.\n" + murle.getMessage());
			return null;
		} catch (NotBoundException nbe) {
			this.logger.info("Client triggered an NotBound Exception.\n" + nbe.getMessage());
			return null;
		}
	}

	public void wasteRes() {
		try{
			remoteServer = (Server) Naming.lookup("rmi://"+serverAddress);
			remoteServer.wasteRes();
		}
		catch(RemoteException re){
			this.logger.info("Client triggered an Remote Exception.\n"+re.getMessage());
		}
		catch(MalformedURLException murle){
			this.logger.info("Client triggered an MalformedURL Exception.\n"+murle.getMessage());
		}
		catch(NotBoundException nbe){
			this.logger.info("Client triggered an NotBound Exception.\n"+nbe.getMessage());
		}

	}

	@Override
	public void run() {
		try {
			this.serverAddress = this.getAddress();
		}
		catch(NullPointerException npe){
			this.logger.info("Client didn't find any Server!");
		}
		this.wasteRes();
	}
}
