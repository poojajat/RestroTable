/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pjat2
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LogInVerification extends UnicastRemoteObject implements LoginInterface
{
    
    public LogInVerification()throws Exception{}
    public boolean checkLogin(String id, String password)throws RemoteException
    {
        if(id.equals("dev") && password.equals("bulbul"))
        return true;
        else 
        return false;
    }
}
