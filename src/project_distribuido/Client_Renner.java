/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project_distribuido;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project_distribuido.IMath;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Client_Renner {
    public static void main(String[] args) {
        try {
            int porta = 1199;
            String registryHost = "192.168.0.103";
            String port = String.valueOf(porta);
            
            IMath math = (IMath) Naming.lookup("//" + registryHost + ":" + port + "/" + "math");
            
            JOptionPane.showMessageDialog(null, math.somar(5, 5));
            
            
        } catch (NotBoundException ex) {
            Logger.getLogger(Client_Renner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client_Renner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_Renner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
