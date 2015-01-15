package balance;

import balance.bbehavior.BalancerBehavior;
import balance.bbehavior.LCBehavior;
import balance.bbehavior.WLCBehavior;

import java.rmi.RemoteException;

public class WLCBalancer extends Balancer {

    private BalancerBehavior bb;

    public WLCBalancer(BalancerBehavior bb) throws RemoteException {
        this.bb = new WLCBehavior();
    }

    @Override
    public void run() {

    }
}
