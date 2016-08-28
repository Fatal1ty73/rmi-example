package ru.fatal1ty73.server;


import ru.fatal1ty73.client.RemoteInterface;

import java.rmi.server.UnicastRemoteObject;


public class ServerImplements extends
        UnicastRemoteObject implements RemoteInterface {
    public ServerImplements() throws Exception {
        super();
    }

    public int add(int x, int y) {

        System.out.println("Get rmi call");
        System.out.println("x = [" + x + "], y = [" + y + "]");
        return (x + y);
    }
}