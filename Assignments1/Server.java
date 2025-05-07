import java.rmi.*;

public class Server{
    public static void main(String[] args)
    {
        try{
            ServerImpl serverImpl = new ServerImpl();
            Naming.rebind("Server", serverImpl);
            System.out.print("Server started...");
              

        }catch(Exception e){
            System.out.println("Exception occured at server:" + e.getMessage());
        }
    }
}
