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
import project_distribuido.Calculo;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Cliente {
    
    public static void main(String[] args) {
        try {
            int porta = 8099;
            String registryHost = "127.0.0.1";
            String port = String.valueOf(porta);
            
            Calculo objCalculo;
            objCalculo = (Calculo)Naming.lookup("//" + registryHost + ":" + port + "/" + "XServer");
            
            double v1 = Double.valueOf(JOptionPane.showInputDialog("Digite o Valor 1: "));
            double v2 = Double.valueOf(JOptionPane.showInputDialog("Digite o Valor 2: "));
            
            JOptionPane.showMessageDialog(null, objCalculo.restOfDivision(v1, v2));
            
        } catch (NotBoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
