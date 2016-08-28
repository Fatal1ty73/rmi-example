package ru.fatal1ty73.client;


import java.rmi.Naming;

public class ClientApp {
    public static void main(String[] args) {
        try {
            RemoteInterface s =
                    (RemoteInterface) Naming.lookup("//localhost/ServerSide");
            System.out.println("sum: " + s.add(1, 3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
