package balance.bbehavior;

import org.apache.log4j.Logger;
import server.Server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class LCBehavior implements BalancerBehavior {

	static Logger logger = org.apache.log4j.Logger.getLogger(LCBehavior.class);
	private Server server;

	public LCBehavior() {

	}

	@Override
	public String useBalance(HashMap<String, Integer> loadFactor) {
		int least = 0;
		String return_key = "";
		Collection<Integer> collection = loadFactor.values();
		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			if (value <= least) {
				least = value;
				//TODO change the order of String and Integer parameter of the Hashmap
			}
		}
		for ( String key : loadFactor.keySet() ) {
			logger.info( key );
		}
		return null;
	}
}