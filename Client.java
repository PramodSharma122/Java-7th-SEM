// Date: 2025-06-15


import java.rmi.RemoteException; 
import java.rmi.NotBoundException; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 
public class Client  
{ 
    public static void main(String args[])throws RemoteException  
    { 
        Client c=new Client(); 
        c.connectRemote(); 
    } 
    private void connectRemote()throws RemoteException 
    { 
        try 
        { 
       Registry reg=LocateRegistry.getRegistry("localhost",5000); 
            Adder ad=(Adder) reg.lookup("Hi Server"); 
            System.out.println("Addition: "+ad.add(5, 3)); 
        } 
        catch(NotBoundException|RemoteException e) 
        { 
            System.out.println(e); 
        } 
    } 
}