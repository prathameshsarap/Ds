import java.rmi.*;
import java.util.*;

public class Client{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            String serverUrl = "rmi://localhost/Server";
            ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverUrl);
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
             System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("First Number is: " + num1);
             System.out.println("Second Number is: " + num2);

             System.out.println("---------------Results--------------");
             System.out.println("Addition is: " + serverIntf.addition(num1,num2));
             System.out.println("subtraction is: " + serverIntf.subtraction(num1,num2));
             System.out.println("Multiplication is: " + serverIntf.multiplication(num1,num2));
             System.out.println("Division is: " + serverIntf.division(num1,num2));


        }catch(Exception e){
            System.out.println("Exception occured at client:" + e.getMessage());
        }
    }
}

