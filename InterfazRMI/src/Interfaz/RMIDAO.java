/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author juand
 */
public interface RMIDAO {
    public int sumar(int numero1, int numero2)throws RemoteException;
    public int restar(int numero1, int numero2)throws RemoteException;
    public int multiplicar(int numero1, int numero2)throws RemoteException;
    public float dividir(float numero1, float numero2)throws RemoteException;
    public String Mensaje(String mensaje)throws RemoteException;
}
