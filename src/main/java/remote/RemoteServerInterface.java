package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Wolfgang on 15.01.2015.
 */
public interface RemoteServerInterface extends Remote{
    public void wasteRes() throws RemoteException;
}
