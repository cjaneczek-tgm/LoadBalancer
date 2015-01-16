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
	private ArrayList<String> urlist2;
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
			this.logger.info(pattern.get(count));
			return pattern.get(count-1);
		}


	}

	public void generatePattern(HashMap<Integer,String> loadFactor){

		urlist = new ArrayList<Integer>(loadFactor.keySet());
		urlist2 = new ArrayList<String>(loadFactor.values());
		ArrayList<Integer> temp = urlist;
		int least = 0, index = 0, keyindex = 0;
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
					keyindex = 0;

				}
				else {
					if (key >= least) {
						least = key;
						keyindex = index;
					}
				}
				index++;
			}
			logger.info(""+least);
			logger.info("Ergebnis: "+ urlist2.get(keyindex));
			pattern.add(""+urlist2.get(keyindex));
			temp.set(keyindex, temp.get(keyindex) - 1);
			logger.info("Liste: "+ urlist.toString());

			set = false;
		}
	}
}
