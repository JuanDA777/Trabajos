/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author juand
 */
public class ControladorLogin {
    private String usuario;
    private String contraseña;

    public ControladorLogin(String Usuario, String Contraseña) {
        if(this.VerificarUsuarios(usuario, contraseña)){
            this.usuario = Usuario;
            this.contraseña = Contraseña; 
        }
        
    }
    
    public boolean VerificarUsuarios(String Usuario, String Contraseña){
    boolean estado=false;
    if((usuario.equals("Juandiego"))&&(contraseña.equals("12345")))
        estado = true;
    return estado;
}
