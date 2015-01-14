package balance.bbehavior;

import server.Server;

import java.util.HashMap;

public class WRRBehavior implements BalancerBehavior {

	private Server server;
	public WRRBehavior(){

	}

	@Override
	public String useBalance(HashMap<String, Integer> loadFactor) {
		return null;
	}
}
