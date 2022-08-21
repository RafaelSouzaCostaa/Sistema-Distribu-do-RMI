/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project_distribuido;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael de Souza Costa
 */
public class XServer {
    public static void main(String[] args){
        try {
            int porta = 8099;
            LocateRegistry.createRegistry(porta);
            String registryHost = "127.0.0.1";
            String port = String.valueOf(porta);
            
            Controller control = new Controller();
            
            Naming.rebind("//" + registryHost + ":" + port + "/" + "XServer", control);
                       
        } catch (RemoteException ex) {
            Logger.getLogger(XServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(XServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
