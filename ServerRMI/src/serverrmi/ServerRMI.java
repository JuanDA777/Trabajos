/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serverrmi;

import Interfaz.RMIDAO;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.management.remote.rmi.RMIServer;

/**
 *
 * @author juand
 */
public class ServerRMI extends UnicastRemoteObject implements RMIDAO{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Registry registro = LocateRegistry.createRegistry(777);
            registro.rebind("Remoto RMI", new ServerRMI());
            System.out.println("Seridor esta funcionando");
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ServerRMI() throws RemoteException{
        super();
    }

    @Override
    public int sumar(int numero1, int numero2) throws RemoteException {
        return numero1+numero2;
    }

    @Override
    public int restar(int numero1, int numero2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int multiplicar(int numero1, int numero2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float dividir(float numero1, float numero2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Mensaje(String mensaje) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
