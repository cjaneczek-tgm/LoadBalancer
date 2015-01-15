package balance;

import balance.bbehavior.BalancerBehavior;
import balance.bbehavior.LCBehavior;

public class LCBalancer extends Balancer {

    private BalancerBehavior bb;
    public LCBalancer(BalancerBehavior bb){
        this.bb = new LCBehavior();
    }

    @Override
    public void run() {

    }
}
