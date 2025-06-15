// Date: 2025-06-15


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server extends UnicastRemoteObject implements Adder {
    Server() throws RemoteException {
        super();
    }

    public int add(int x, int y) {

        return x + y;
    }

    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.rebind("Hi Server", new Server());
            System.out.println("Server is ready ...");
        } catch (Throwable e) {
            System.out.println(e);
        }
    }
}
