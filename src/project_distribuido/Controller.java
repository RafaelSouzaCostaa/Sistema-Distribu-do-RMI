/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project_distribuido;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import project_distribuido.Calculo;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Controller extends UnicastRemoteObject implements Calculo{

    public Controller() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 1L;
    
    @Override
    public String restOfDivision(double v1, double v2) throws RemoteException {
        return "Estou vindo do Servidor! Seu valor calculado e: " + v1 % v2; //Resto da divisao
    }

}
