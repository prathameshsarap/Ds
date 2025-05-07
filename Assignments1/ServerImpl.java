import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException{

    }
     public double addition (double num1, double num2) throws RemoteException 
     {
            return num1 + num2;
     }
    public double subtraction (double num1, double num2) throws RemoteException {
            return num1 - num2;
    }
    public double multiplication (double num1, double num2) throws RemoteException {
            return num1 * num2;
    }
    public double division (double num1, double num2) throws RemoteException {
        if(num2 != 0)
        {
            return num1 / num2;
        }
        else{
            System.out.println("Cannot Divide a number by Zero!");
            return 0;
        }
            
    }
}
