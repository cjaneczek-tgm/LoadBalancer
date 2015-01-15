package balance.bbehavior;

import org.apache.log4j.Logger;
import server.Server;

import java.util.ArrayList;
import java.util.HashMap;

public class WRRBehavior implements BalancerBehavior {

	private Server server;
	private int count = 0;
	private ArrayList<String> pattern = new ArrayList<String>();
	private ArrayList<Integer> urlist;
	static Logger logger = org.apache.log4j.Logger.getLogger(WRRBehavior.class);

	public WRRBehavior(){

	}

	@Override
	public String useBalance(HashMap<Integer,String> loadFactor) {
		generatePattern(loadFactor);
		this.logger.info(pattern.toString());
		if(count+1 >= pattern.size()) {
			count = 0;
			return pattern.get(pattern.size() - 1);
		}
		else{
			count++;
		}
		this.logger.info(pattern.get(count));
		return pattern.get(count);
	}

	public void generatePattern(HashMap<Integer,String> loadFactor){

		urlist = new ArrayList<Integer>(loadFactor.keySet());
		ArrayList<Integer> temp = urlist;
		int least = 0, index = 0;
		boolean set = false;
		int sum = 0;

		for(int z : urlist){
			sum += z;
		}

		for(int i = 0; i < sum; i++) {
			for (int key : temp) {
				if (!set) {
					least = key;
					set = true;
					index = 0;
				} else {
					logger.info("key vs least: "+key+" vs "+least+"\nIndex: "+index);
					//TODO dieses if ist falsch siehe log file
					if (key >= least) {
						logger.info("Got in");
						if(index+1 == temp.size())
							least = index;
						else
							least = index+1;
					}
				}
				index++;
			}
			logger.info("LName: "+loadFactor.get(urlist.get(least)));
			pattern.add(loadFactor.get(urlist.get(least)));
			temp.set(least, temp.get(least) - 1);
			logger.info("Liste: "+ urlist.toString());
			set = false;
		}
	}
}
