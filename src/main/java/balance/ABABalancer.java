package balance;

import balance.bbehavior.ABABehavior;
import balance.bbehavior.BalancerBehavior;
import balance.bbehavior.LCBehavior;

import java.rmi.RemoteException;

public class ABABalancer extends Balancer {

    private BalancerBehavior bb;

    public ABABalancer(BalancerBehavior bb) throws RemoteException {
        this.bb = new ABABehavior();
    }

    @Override
    public void run() {
        
    }
}
