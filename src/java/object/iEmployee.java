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
public interface iEmployee {
    public String getIdemployee();;
    public void setIdemployee(String idemployee);;
    public String getName();;
    public void setName(String name);;
    public String getPosition();;
    public void setPosition(String position);;  
    public int doInsert();;
    public int doUpdate();;
    public int doDelete();;  
    public ArrayList display();;
    public ArrayList getRecord();;
    public  ArrayList searchEmployee();;
  
    
}
