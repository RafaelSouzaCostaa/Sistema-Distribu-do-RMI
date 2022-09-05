/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package project_distribuido;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface IMath extends Remote{
    public double somar(double n1, double n2) throws RemoteException;
}
