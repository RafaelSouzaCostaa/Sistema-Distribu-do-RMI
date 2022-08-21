/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package project_distribuido;

import java.rmi.Remote;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface Calculo extends Remote{
    public String restOfDivision(double v1, double v2) throws java.rmi.RemoteException;
}
