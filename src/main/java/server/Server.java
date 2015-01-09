package server;

import server.sbehavior.ServerBehavior;

public abstract class Server implements Runnable {

	public Server(){

	}
	private ServerBehavior behavior;

	public Server(ServerBehavior behavior) {

	}

	public void wasteRes() {

	}

	public void setBehavior(ServerBehavior sb) {

	}

	public void addServer(String adress) {

	}

}
