import balance.bbehavior.BalancerBehavior;
import balance.bbehavior.WRRBehavior;
import org.apache.log4j.Logger;
import org.junit.Test;
import server.Server;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chris on 16.01.2015.
 */
public class TestWRRBehavior {

    static Logger logger = org.apache.log4j.Logger.getLogger(WRRBehavior.class);
    private Server server;

    @Test
    public void testUseBalance(){
        BalancerBehavior wrrbehavior = new WRRBehavior();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0,"Samuel");
        hashMap.put(1,"Bernhard");
        hashMap.put(2,"Josef");
        hashMap.put(3,"Wolfgang");
        hashMap.put(4,"Thomas");
        logger.info("Output: "+ wrrbehavior.useBalance(hashMap));
        assertEquals("Josef", wrrbehavior.useBalance(hashMap));
    }
}
