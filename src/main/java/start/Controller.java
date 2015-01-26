package start;

import balance.LCBalancer;
import balance.bbehavior.LCBehavior;
import cli.CommandLineInterface;
import client.Client;
import org.apache.commons.cli2.OptionException;
import server.ServerRAM;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Controller {

	public static void main(String[] args) {
		CommandLineInterface cl = null;
		ServerRAM server;
		Client client;
		LCBalancer lclb;
		try {
			cl = new CommandLineInterface(args);
		} catch (OptionException e) {
			e.printStackTrace();
		}

		/*

		if(cl.getType().toLowerCase().equals("server")){
			try {
				server = new ServerRAM(cl.getAddress(), Double.parseDouble(cl.getWeight()));
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}

		if(cl.getType().toLowerCase().equals("client")){
			try {
				client = new Client(cl.getAddress());
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (NotBoundException e) {
				e.printStackTrace();
			}
		}

		if(cl.getType().toLowerCase().equals("loadbalancer")){
			try {
				lclb = new LCBalancer(new LCBehavior());
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
		*/

		try {
			lclb = new LCBalancer(new LCBehavior());
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		try {
			server = new ServerRAM("localhost", 1.);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		try {
			client = new Client("localhost");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

	}

}
