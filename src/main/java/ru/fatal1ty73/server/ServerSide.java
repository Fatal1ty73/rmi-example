package ru.fatal1ty73.server;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerSide {
    public static void main(String[] args) {
        {

            try { //special exception handler for registry creation
                LocateRegistry.createRegistry(1099);
                System.out.println("java RMI registry created.");
            } catch (RemoteException e) {
                //do nothing, error means registry already exists
                System.out.println("java RMI registry already exists.");
            }

            try {
                ServerImplements s = new ServerImplements();
                Naming.rebind("//localhost/ServerSide", s);
                System.out.println("Server Started ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
