/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientermi;

/**
 *
 * @author sistemas
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interface.RMIDAO;

public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            int suma;
            suma = interfaz.sumar(10, 14);
            System.out.println(suma);
            
            int restar;
            restar = interfaz.restar(80, 78);
            System.out.println(restar);
            
            int multiplicar;
            multiplicar = interfaz.multiplicar(10, 40);
            System.out.println(multiplicar );
            
            float dividir;
            dividir = interfaz.dividir(78, 6);
            System.out.println(dividir);
            
        }catch(Exception e){
            System.out.println(""+e);
            
        }
    }
    
}
