package balance;

import balance.bbehavior.BalancerBehavior;
import java.util.HashMap;

public abstract class Balancer implements Runnable {

	public Balancer(){

	}
	private HashMap<String,Integer> loadFactor;

	private BalancerBehavior behavior;

	public Balancer(BalancerBehavior behavior) {

	}

	public void addServer(String address) {

	}

	public String balance(BalancerBehavior behavior) {
		return null;
	}

	public String getAddress() {
		return null;
	}

}
