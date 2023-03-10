/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import controlador.Operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author juand
 */
public class Calculadora extends javax.swing.JFrame {
    private String numeros="";
    private final Operaciones operaciones;
    private float numero1;
    private int operacion;
    private String resultado;
    
    
    public String Concatenar(String numero){
        numeros=pantalla.getText();
        if(pantalla.getText().equals("0")){
            numeros=numero;
        }else{
            numeros+=numero;
        }
        return numeros;
    } 
    
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        this.setTitle("Calculadora de juan :)");
        operaciones=new Operaciones();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelNumeros = new javax.swing.JPanel();
        Boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        panelBorrar = new javax.swing.JPanel();
        botonBorrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        panelOperaciones = new javax.swing.JPanel();
        botonMas = new javax.swing.JButton();
        botonMenos = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        getContentPane().add(pantalla, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout(3, 3));

        panelNumeros.setLayout(new java.awt.GridLayout(4, 4));

        Boton1.setBackground(new java.awt.Color(0, 0, 0));
        Boton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton1.setForeground(new java.awt.Color(255, 255, 255));
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        panelNumeros.add(Boton1);

        boton2.setBackground(new java.awt.Color(0, 0, 0));
        boton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton2);

        boton3.setBackground(new java.awt.Color(0, 0, 0));
        boton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton3);

        boton4.setBackground(new java.awt.Color(0, 0, 0));
        boton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton4);

        boton5.setBackground(new java.awt.Color(0, 0, 0));
        boton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton5);

        boton6.setBackground(new java.awt.Color(0, 0, 0));
        boton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton6);

        boton7.setBackground(new java.awt.Color(0, 0, 0));
        boton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton7);

        boton8.setBackground(new java.awt.Color(0, 0, 0));
        boton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton8);

        boton9.setBackground(new java.awt.Color(0, 0, 0));
        boton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton9.setForeground(new java.awt.Color(255, 255, 255));
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton9);

        botonPunto.setBackground(new java.awt.Color(0, 0, 0));
        botonPunto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonPunto.setForeground(new java.awt.Color(255, 255, 255));
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        panelNumeros.add(botonPunto);

        boton0.setBackground(new java.awt.Color(0, 0, 0));
        boton0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton0.setForeground(new java.awt.Color(255, 255, 255));
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        panelNumeros.add(boton0);

        botonIgual.setBackground(new java.awt.Color(0, 0, 0));
        botonIgual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(255, 255, 255));
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        panelNumeros.add(botonIgual);

        jPanel1.add(panelNumeros, java.awt.BorderLayout.CENTER);

        panelBorrar.setLayout(new java.awt.GridLayout(1, 0, 3, 3));

        botonBorrar.setBackground(new java.awt.Color(255, 153, 51));
        botonBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonBorrar.setText("C");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        panelBorrar.add(botonBorrar);

        botonEliminar.setBackground(new java.awt.Color(255, 153, 51));
        botonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelBorrar.add(botonEliminar);

        jPanel1.add(panelBorrar, java.awt.BorderLayout.PAGE_START);

        panelOperaciones.setLayout(new java.awt.GridLayout(0, 1, 3, 3));

        botonMas.setBackground(new java.awt.Color(255, 153, 51));
        botonMas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonMas.setText("+");
        botonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasActionPerformed(evt);
            }
        });
        panelOperaciones.add(botonMas);

        botonMenos.setBackground(new java.awt.Color(255, 153, 51));
        botonMenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonMenos.setText("-");
        botonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosActionPerformed(evt);
            }
        });
        panelOperaciones.add(botonMenos);

        botonMultiplicacion.setBackground(new java.awt.Color(255, 153, 51));
        botonMultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonMultiplicacion.setText("*");
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicacionActionPerformed(evt);
            }
        });
        panelOperaciones.add(botonMultiplicacion);

        botonDivision.setBackground(new java.awt.Color(255, 153, 51));
        botonDivision.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        panelOperaciones.add(botonDivision);

        jPanel1.add(panelOperaciones, java.awt.BorderLayout.LINE_END);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        pantalla.setText(Concatenar("1"));
    }//GEN-LAST:event_Boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        pantalla.setText(Concatenar("2"));
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        pantalla.setText(Concatenar("3"));
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        pantalla.setText(Concatenar("4"));
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        pantalla.setText(Concatenar("5"));
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        pantalla.setText(Concatenar("6"));
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        pantalla.setText(Concatenar("7"));
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        pantalla.setText(Concatenar("8"));
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        pantalla.setText(Concatenar("9"));
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        pantalla.setText(Concatenar("0"));
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        pantalla.setText("0");
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        String cadena;
        cadena=pantalla.getText();
        if(cadena.length()>1){
            numeros=cadena.substring(0,cadena.length()-1);
            pantalla.setText(numeros);
        }else{
            pantalla.setText("0");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if (!(this.pantalla.getText().contains("."))){
           this.pantalla.setText(pantalla.getText()+"."); 
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        float numero2= Float.parseFloat(pantalla.getText());
        
        switch(operacion){
            case 1 -> {
                pantalla.setText(operaciones.sumar(numero1, numero2));
                resultado = pantalla.getText();
                operacion = 0;
                break;
            }
            case 2 -> {
                pantalla.setText(operaciones.restar(numero1, numero2));
                resultado = pantalla.getText();
                operacion = 0;
                break;
            }
            case 3 -> {
                pantalla.setText(operaciones.multiplicar(numero1, numero2));
                resultado = pantalla.getText();
                operacion = 0;
                break;
            }
            case 4 -> {
                pantalla.setText(operaciones.dividir(numero1, numero2));
                resultado = pantalla.getText();
                operacion = 0;
                break;
            }
                
        }
        pantalla.setText(operaciones.quitarDecimal(resultado));
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasActionPerformed
        numero1 = Float.parseFloat(pantalla.getText());
        pantalla.setText("0");
        operacion = 1;
    }//GEN-LAST:event_botonMasActionPerformed

    private void botonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosActionPerformed
        numero1 = Float.parseFloat(pantalla.getText());
        pantalla.setText("0");
        operacion = 2;
    }//GEN-LAST:event_botonMenosActionPerformed

    private void botonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicacionActionPerformed
        numero1 = Float.parseFloat(pantalla.getText());
        pantalla.setText("0");
        operacion = 3;
    }//GEN-LAST:event_botonMultiplicacionActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        numero1 = Float.parseFloat(pantalla.getText());
        pantalla.setText("0");
        operacion = 4;
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton botonMenos;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBorrar;
    private javax.swing.JPanel panelNumeros;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
