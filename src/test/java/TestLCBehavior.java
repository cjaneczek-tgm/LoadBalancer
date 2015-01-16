import balance.bbehavior.BalancerBehavior;
import balance.bbehavior.LCBehavior;
import org.apache.log4j.Logger;
import org.junit.Test;
import server.Server;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chris on 16.01.2015.
 */
public class TestLCBehavior {

    static Logger logger = org.apache.log4j.Logger.getLogger(LCBehavior.class);
    private Server server;

    @Test
    public void testUseBalanceWith0(){
        BalancerBehavior lcbehavior = new LCBehavior();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0,"Samuel");
        hashMap.put(1,"Bernhard");
        hashMap.put(2,"Josef");
        hashMap.put(3,"Wolfgang");
        hashMap.put(4,"Thomas");
        logger.info("Output: "+ lcbehavior.useBalance(hashMap));
        assertEquals("Samuel", lcbehavior.useBalance(hashMap));
    }
    @Test
    public void testUseBalanceWithout0(){
        BalancerBehavior lcbehavior = new LCBehavior();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"Bernhard");
        hashMap.put(2,"Josef");
        hashMap.put(3,"Wolfgang");
        hashMap.put(4,"Thomas");
        logger.info("Output: "+ lcbehavior.useBalance(hashMap));
        assertEquals("Bernhard", lcbehavior.useBalance(hashMap));
    }
//    @Test
//    public void testUseBalanceMultiple(){
//        BalancerBehavior lcbehavior = new LCBehavior();
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//        hashMap.put(1,"Bernhard");
//        hashMap.put(2,"Josef");
//        hashMap.put(3,"Wolfgang");
//        hashMap.put(4,"Thomas");
//        logger.info("Output: "+ lcbehavior.useBalance(hashMap));
//        //this should give you Bernhard
//        lcbehavior.useBalance(hashMap);
//        //this should give you Josef
//        assertEquals("Josef", lcbehavior.useBalance(hashMap));
//    }
}
