package balance;

import balance.bbehavior.BalancerBehavior;
import balance.bbehavior.LCSSTBehavior;

import java.rmi.RemoteException;

public class LCSSTBalancer extends Balancer{

    private BalancerBehavior bb;

    public LCSSTBalancer(BalancerBehavior bb) throws RemoteException {
        this.bb = new LCSSTBehavior();
        }

    @Override
    public void run() {
        
    }
}
