/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pjat2
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface LoginInterface extends Remote{
    public boolean checkLogin(String id,String password)throws RemoteException;
            
}
