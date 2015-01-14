import balance.bbehavior.BalancerBehavior;
import balance.bbehavior.LCBehavior;
import balance.bbehavior.WRRBehavior;
import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * Just testing Log4j again...
 */
public class TestLog4jFunc {
    static Logger logger = org.apache.log4j.Logger.getLogger(TestLog4jFunc.class);

    public static void main(String[] args) {

        BalancerBehavior lcBehavior = new LCBehavior();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Bernhard",1);
        hashMap.put("Josef",2);
        hashMap.put("Wolfgang",3);
//        logger.info("Output hashmap: "+hashMap.get("Bernhard"));
        lcBehavior.useBalance(hashMap);
    }
}
