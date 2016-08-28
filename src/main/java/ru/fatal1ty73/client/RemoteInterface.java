package ru.fatal1ty73.client;

import java.rmi.Remote;

/**
 * Created by emil on 28.08.16.
 */
public interface RemoteInterface extends Remote {
    public int add(int x, int y) throws Exception;
}