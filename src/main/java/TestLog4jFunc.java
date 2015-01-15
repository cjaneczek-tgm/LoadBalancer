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

        BalancerBehavior wrrBehavior = new WRRBehavior();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        //hashMap.put(0,"Samuel");
        hashMap.put(1,"Bernhard");
        hashMap.put(2,"Josef");
        hashMap.put(3,"Wolfgang");
        logger.info("Output: "+ wrrBehavior.useBalance(hashMap));
        wrrBehavior.useBalance(hashMap);
    }
}
