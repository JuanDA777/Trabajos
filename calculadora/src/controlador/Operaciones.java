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
    public String quitarDecimal(String resultado) {
    if (resultado.endsWith(".0")) {
        resultado = resultado.substring(0, resultado.length() - 2);
    }
    return resultado;
    }
    
    
}

