package balance.bbehavior;

import org.apache.log4j.Logger;
import server.Server;

import java.util.HashMap;

public class LCBehavior implements BalancerBehavior {

	static Logger logger = org.apache.log4j.Logger.getLogger(LCBehavior.class);
	private Server server;

	public LCBehavior() {	}

	/**
	 * The LeastConnection version of the method useBalance returns the server-address with the least connection
	 * @param loadFactor the HashMap in which the addresses + count of connections are stored
	 * @return the address of the server with the least connection, as a String object
	 */
	@Override
	public String useBalance(HashMap<Integer,String> loadFactor) {
		int least = 0;
		for ( int key : loadFactor.keySet() ) {
			if(key <= least) {
				least = key;
			}
		}
		//logger.info(loadFactor.get(least));
		return loadFactor.get(least);
	}
}