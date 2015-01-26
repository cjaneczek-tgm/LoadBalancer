package server;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Random;

public class ServerRAM extends Server {

    private String name = "Server";
    private double weight = 1;

    /**
     * A Constructor which adds a name to the already existing
     * name "Server " and a weight which defines the Load for the Balancer
     * @param name The addition
     * @param weight
     */
    public ServerRAM(String name, double weight) throws RemoteException{
        this.name += name;
        this.weight = weight;
        super.logger.info(name+" is generated!");
        if (System.getSecurityManager() == null) {
            System.setProperty("java.security.policy", System.getProperty("user.dir") + "\\server.policy");
            System.setSecurityManager(new SecurityManager());
        }
    }

    @Override
    public void run() {
        while(true){
        }
    }
}