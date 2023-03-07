/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
//hola mundo
/**
 *
 * @author juand
 */
public class Operaciones {
    public String sumar(float numero1, float numero2){
        float resultado = numero1 + numero2;
        return resultado +"";
    }
    public String restar(float numero1, float numero2){
        float resultado = numero1 - numero2;
        return resultado +"";
    }
    public String multiplicar(float numero1, float numero2){
        float resultado = numero1 * numero2;
        return resultado +"";
    }
    public String dividir(float numero1, float numero2){
        float resultado = numero1 / numero2;
        
        return resultado +"";
    }
    
    public String sinPunto(float resultado){
        String retorno = "";
        retorno =Float.toString(resultado);
        if (resultado%1 == 0) {
            retorno = retorno.substring(0,retorno.length()-2);
        }
        return retorno;
    }
}

