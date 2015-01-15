package balance;

import balance.bbehavior.BalancerBehavior;
import balance.bbehavior.LCBehavior;

import java.rmi.RemoteException;

public class WRRBalancer extends Balancer{

    private BalancerBehavior bb;

    public WRRBalancer(BalancerBehavior bb) throws RemoteException{
        this.bb = new LCBehavior();
    }

    @Override
    public void run() {

    }
}
