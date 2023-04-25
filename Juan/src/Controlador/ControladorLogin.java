package Controlador;

import DAO.DAOLogin;
import java.util.ResourceBundle;

/**
 *
 * @author Alejandro Portilla y Juan Arevalo
 * @ver 1.0
 */
public class ControladorLogin implements DAOLogin{
/**
 *
 * @author Alejandro Portilla y Juan Arevalo
 * Creando atributos, contraseña, usuario, controladorLgin todos privados
 */
    private static ControladorLogin controladorLogin;
    private String usuario;
    private String contrasenia;
    private ResourceBundle env; 
    private String claveSecreta;
    
    

    private ControladorLogin() {
        
    }
    
    public static ControladorLogin getControladorLogin(){
    /*
     *Creacion de singleton   
     */    
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }

    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        
        this.env = ResourceBundle.getBundle("juan");
        this.claveSecreta = env.getString("claveSecreta");
        System.out.println(env);
        boolean estado=false;   
        if((usuario.equals("juan"))&&(contrasenia.equals(claveSecreta)))
            estado=true;
        
        else if(usuario.equals("daniel")&&(contrasenia.equals(claveSecreta)))
            estado=true;
        
        else if(usuario.equals("jorge")&&(contrasenia.equals(claveSecreta)))
            estado=true;
        
        else if(usuario.equals("daferarte")&&(contrasenia.equals(claveSecreta)))
            estado=true;
        
        else if(usuario.equals("noguera")&&(contrasenia.equals(claveSecreta)))
            estado=true;
        
        return estado;
    }

    @Override
    public String getUsuario() {
        
        return this.usuario;
    }
        
    @Override
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
    
    
    
    
}