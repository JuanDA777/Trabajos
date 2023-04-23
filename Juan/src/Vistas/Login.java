/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.ControladorLogin;
import DAO.DAOLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author juand
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private static Login login;
    private final DAOLogin cLogin=(DAOLogin) ControladorLogin.getControladorLogin();
    
    public Login() {
        initComponents();
        
    }
     public static Login getLogin(){
        //para evitar que se cree mas instancias
        if(login==null)
            login=new Login();
        
        return login;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        contrasenia = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        OlvidoContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setLayout(new java.awt.GridLayout(0, 1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jPanel8);

        usuario.setText("Usuario...");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        jPanel3.add(usuario);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jPanel7);

        jPanel15.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jPanel6);

        contrasenia.setText("Contraseña...");
        contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseniaMouseClicked(evt);
            }
        });
        jPanel4.add(contrasenia);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jPanel5);

        jPanel15.add(jPanel4);

        jButton2.setBackground(new java.awt.Color(109, 118, 129));
        jButton2.setFont(new java.awt.Font("Tilt Warp", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2);

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_END);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setLayout(new java.awt.GridLayout(0, 1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Documents\\TrabajosApo\\Juan\\Imagenes\\Imagen de WhatsApp 2023-04-21 a las 09.07.53.jpg")); // NOI18N
        jPanel16.add(jLabel3);

        jPanel14.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        OlvidoContraseña.setBackground(new java.awt.Color(0, 0, 0));
        OlvidoContraseña.setFont(new java.awt.Font("Tilt Warp", 0, 12)); // NOI18N
        OlvidoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        OlvidoContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OlvidoContraseña.setText("¿Olvidaste tu usuario o contraseña?");
        OlvidoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlvidoContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OlvidoContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OlvidoContraseñaMouseExited(evt);
            }
        });
        jPanel17.add(OlvidoContraseña);

        jPanel13.add(jPanel17, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             if(cLogin.VerificarUsuarios(usuario.getText(), contrasenia.getText())){
                 MenuPrincipal menu = MenuPrincipal.getMenuPrincipal();
                 menu.setVisible(true);
             }
            
             else{
            JOptionPane.showMessageDialog(this, "Usuario incorrecto", "Información", JOptionPane.ERROR_MESSAGE);
             }
             Login login = Login.getLogin();
             login.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OlvidoContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlvidoContraseñaMouseEntered
        OlvidoContraseña.setForeground(new java.awt.Color(255, 50, 20));
    }//GEN-LAST:event_OlvidoContraseñaMouseEntered

    private void OlvidoContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlvidoContraseñaMouseExited
        OlvidoContraseña.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_OlvidoContraseñaMouseExited

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        usuario.setText("");
    }//GEN-LAST:event_usuarioMouseClicked

    private void contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseniaMouseClicked
        contrasenia.setText("");
    }//GEN-LAST:event_contraseniaMouseClicked

    private void OlvidoContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlvidoContraseñaMouseClicked
        JOptionPane.showMessageDialog(null, "El usuario es tu nombre y la contraseña es del 1 al 5");
    }//GEN-LAST:event_OlvidoContraseñaMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OlvidoContraseña;
    private javax.swing.JTextField contrasenia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
