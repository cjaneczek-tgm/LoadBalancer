package balance.bbehavior;

import java.util.HashMap;

public interface BalancerBehavior {

	public abstract String useBalance(HashMap<Integer,String> loadFactor);

}
