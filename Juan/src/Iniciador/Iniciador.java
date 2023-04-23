/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iniciador;

import Vistas.Login;

/**
 *
 * @author juand
 */
public class Iniciador {
    public static void main(String[] args) {
        // estamos llamando al a clase Login e inicia la interfaz
        Login login=Login.getLogin();
        login.setVisible(true);
    }
}
