/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface iAdmin {
    public String getIdadmin() ;;
    public void setIdadmin(String idadmin);;
    public String getUsername();;
    public void setUsername(String username);;
    public String getPassword();;
    public void setPassword(String password);; 
    public int doInsert();;
    public int doUpdate();;
    public int doDelete();;  
    public ArrayList display();;
    public ArrayList getRecord();;
    public int doLogin();;  
    public String[] caridataAdmin();;
}
