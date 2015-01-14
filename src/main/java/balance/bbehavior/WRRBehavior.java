package balance.bbehavior;

import server.Server;

import java.util.HashMap;

public class WRRBehavior implements BalancerBehavior {

	private Server server;
	public WRRBehavior(){

	}

	@Override
	public String useBalance(HashMap<String, Integer> loadFactor) {
//		int least = 0;
//		for(int i=0; i<loadFactor.size();i++){
//		}
		return null;
	}
}
